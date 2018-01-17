package io.github.erikcaffrey.livedata_databinding.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import io.github.erikcaffrey.livedata_databinding.R
import io.github.erikcaffrey.livedata_databinding.databinding.ActivityDcCharacterBinding
import io.github.erikcaffrey.livedata_databinding.viewmodel.DcCharacterViewModel
import kotlinx.android.synthetic.main.activity_dc_character.*

class DcCharacterActivity : AppCompatActivity() {

    private lateinit var dcCharacterBinderAdapter: DcCharacterBinderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dcCharacterViewModel = ViewModelProviders.of(this).get(DcCharacterViewModel::class.java)
        val activityDcCharacterBinding: ActivityDcCharacterBinding? = DataBindingUtil.setContentView(this, R.layout.activity_dc_character)
        initAdapter(dcCharacterViewModel)
        initRecycler()


        activityDcCharacterBinding.let {
            it!!.dcCharacterViewModel = dcCharacterViewModel
            it.setLifecycleOwner(this)
        }
    }

    private fun initAdapter(dcCharacterViewModel: DcCharacterViewModel) {
        dcCharacterBinderAdapter = DcCharacterBinderAdapter(this, dcCharacterViewModel.getDcCharacterList())
    }

    private fun initRecycler() {
        recycler_dc_character.layoutManager = GridLayoutManager(this, 2)
        recycler_dc_character.setHasFixedSize(true)
        recycler_dc_character.adapter = dcCharacterBinderAdapter
    }

}
