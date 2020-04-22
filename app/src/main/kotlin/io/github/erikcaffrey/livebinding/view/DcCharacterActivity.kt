package io.github.erikcaffrey.livebinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import io.github.erikcaffrey.livebinding.di.ServiceLocator
import io.github.erikcaffrey.livebinding.view.images.MarginDecoration
import io.github.erikcaffrey.livedata_databinding.R
import io.github.erikcaffrey.livedata_databinding.databinding.ActivityDcCharacterBinding
import kotlinx.android.synthetic.main.activity_dc_character.recycler_dc_character

class DcCharacterActivity : AppCompatActivity() {

    private val dcCharacterBinderAdapter: DcCharacterBinderAdapter by lazy { DcCharacterBinderAdapter() }
    private lateinit var activityDcCharacterBinding: ActivityDcCharacterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDcCharacterBinding = DataBindingUtil.setContentView(this, R.layout.activity_dc_character)
        initRecycler()
        initObserver()
    }

    private fun initRecycler() {
        recycler_dc_character.run {
            addItemDecoration(MarginDecoration(context))
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = dcCharacterBinderAdapter
        }
    }

    private fun initObserver() {
        val dcCharacterViewModel = ServiceLocator.getDcCharacterViewModel(this)
        activityDcCharacterBinding.run {
            viewModel = dcCharacterViewModel
            lifecycleOwner = this@DcCharacterActivity
        }
    }
}
