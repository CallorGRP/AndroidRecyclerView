package tech.thdev.androidrecyclerview.adapter.hfsample.model

import tech.thdev.androidrecyclerview.data.FlipItems
import tech.thdev.androidrecyclerview.data.Image
import tech.thdev.support.widget.adapter.model.BaseRecyclerModel

/**
 * Created by Tae-hwan on 25/10/2016.
 */

interface ImageHFAdapterContract {

    interface View {
        fun reload()
    }

    interface Model : BaseRecyclerModel<Image> {

        fun addHeaderItems(headerItem: FlipItems?)
    }
}