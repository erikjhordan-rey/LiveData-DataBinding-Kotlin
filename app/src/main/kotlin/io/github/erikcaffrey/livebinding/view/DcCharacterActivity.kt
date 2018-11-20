package io.github.erikcaffrey.livebinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import io.github.erikcaffrey.livedata_databinding.R
import io.github.erikcaffrey.livedata_databinding.databinding.ActivityDcCharacterBinding
import io.github.erikcaffrey.livebinding.viewmodel.DcCharacterViewModel
import kotlinx.android.synthetic.main.activity_dc_character.recycler_dc_character

class DcCharacterActivity : AppCompatActivity() {

    private val dcCharacterBinderAdapter: DcCharacterBinderAdapter by lazy { DcCharacterBinderAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDcCharacterBinding: ActivityDcCharacterBinding? = DataBindingUtil.setContentView(this, R.layout.activity_dc_character)
        initRecycler()
        initObserver(activityDcCharacterBinding)
    }

    private fun initRecycler() {
        recycler_dc_character.run {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = dcCharacterBinderAdapter
        }
    }

    private fun initObserver(activityDcCharacterBinding: ActivityDcCharacterBinding?) {
        val dcCharacterViewModel = ViewModelProviders.of(this).get(DcCharacterViewModel::class.java)

        dcCharacterViewModel.getDcCharacterList().observe(this, Observer {
            dcCharacterBinderAdapter.setDcCharacterList(it)
            dcCharacterBinderAdapter.notifyDataSetChanged()
        })

        activityDcCharacterBinding?.run {
            this.dcCharacterViewModel = dcCharacterViewModel
            setLifecycleOwner(this@DcCharacterActivity)
        }
    }
}
