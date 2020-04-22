package io.github.erikjhordanrey.livebinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import io.github.erikjhordanrey.livebinding.R
import io.github.erikjhordanrey.livebinding.databinding.ActivityDcCharacterBinding
import io.github.erikjhordanrey.livebinding.di.ServiceLocator
import io.github.erikjhordanrey.livebinding.view.images.MarginDecoration
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
