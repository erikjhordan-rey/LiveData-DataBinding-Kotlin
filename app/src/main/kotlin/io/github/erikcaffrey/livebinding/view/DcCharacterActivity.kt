package io.github.erikcaffrey.livebinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import io.github.erikcaffrey.livebinding.viewmodel.DcCharacterViewModel
import io.github.erikcaffrey.livedata_databinding.R
import io.github.erikcaffrey.livedata_databinding.databinding.ActivityDcCharacterBinding

class DcCharacterActivity : AppCompatActivity() {
    private val dcCharacterBinderAdapter: DcCharacterBinderAdapter by lazy { DcCharacterBinderAdapter() }
    lateinit var activityDcCharacterBinding: ActivityDcCharacterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDcCharacterBinding = DataBindingUtil.setContentView(this, R.layout.activity_dc_character)
        initObserver()
    }

    private fun initObserver() {
        val dcCharacterViewModel = ViewModelProviders.of(this).get(DcCharacterViewModel::class.java)
        activityDcCharacterBinding.run {
            recyclerDcCharacter.adapter = dcCharacterBinderAdapter
            viewmodel = dcCharacterViewModel
            lifecycleOwner = this@DcCharacterActivity
        }
    }
}
