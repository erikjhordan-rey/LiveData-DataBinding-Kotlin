package io.github.erikcaffrey.livebinding.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.github.erikcaffrey.livebinding.model.DcCharacter
import io.github.erikcaffrey.livedata_databinding.R

class DcCharacterBinderAdapter : RecyclerView.Adapter<DcCharacterBinderHolder>() {
    private var dcCharacterList: List<DcCharacter> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcCharacterBinderHolder =
            DcCharacterBinderHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                    R.layout.item_dc_character, parent, false))

    override fun onBindViewHolder(holder: DcCharacterBinderHolder, position: Int) {
        val dcCharacter = dcCharacterList[position]
        holder.bind(dcCharacter)
    }

    override fun getItemCount() = dcCharacterList.size

    fun setDcCharacterList(dcCharacterList: List<DcCharacter>) {
        this.dcCharacterList = dcCharacterList
        notifyDataSetChanged()
    }
}
