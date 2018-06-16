package io.github.erikcaffrey.livedatadatabinding.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import io.github.erikcaffrey.livedatadatabinding.R
import io.github.erikcaffrey.livedatadatabinding.databinding.ActivityDcCharacterBinding
import io.github.erikcaffrey.livedatadatabinding.viewmodel.DcCharacterViewModel

class DcCharacterActivity : AppCompatActivity() {
    private lateinit var dcCharacterBinderAdapter: DcCharacterBinderAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDcCharacterBinding: ActivityDcCharacterBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_dc_character)
        dcCharacterBinderAdapter = DcCharacterBinderAdapter()
        activityDcCharacterBinding.recyclerDcCharacter.apply {
            layoutManager = GridLayoutManager(this.context, 3)
            setHasFixedSize(true)
            adapter = dcCharacterBinderAdapter
        }
        val dcCharacterViewModel = ViewModelProviders.of(this).get(DcCharacterViewModel::class.java)
        dcCharacterViewModel.getDcCharacterList().observe(this, Observer {
            dcCharacterBinderAdapter.setDcCharacterList(it!!)
        })
        activityDcCharacterBinding.dcCharacterViewModel = dcCharacterViewModel
        activityDcCharacterBinding.setLifecycleOwner(this)
    }
}