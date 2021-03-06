package tech.thdev.support.widget.adapter.simple.holder

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import tech.thdev.support.widget.adapter.AbstractArrayRecyclerAdapter
import tech.thdev.support.widget.listener.OnItemClickListener
import tech.thdev.support.widget.listener.OnItemLongClickListener

/**
 * Created by Tae-hwan on 10/10/2016.
 */

abstract class BaseViewHolder<ITEM>(
        open val adapter: RecyclerView.Adapter<*>, itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    constructor(@LayoutRes layoutRes: Int, parent: ViewGroup?, adapter: RecyclerView.Adapter<*>)
            : this(adapter,
            LayoutInflater.from((adapter as? AbstractArrayRecyclerAdapter<*, *>)?.context).inflate(layoutRes, parent, false))

    /**
     * ButterKnife definition
     */
    init {
        ButterKnife.bind(BaseViewHolder@this, itemView)
    }

    /**
     * Definition of a holder
     */
    abstract fun onBindViewHolder(item: ITEM?, position: Int)


    protected val context: Context?
        get() = (adapter as? AbstractArrayRecyclerAdapter<*, *>)?.context

    /**
     * OnItemClick definition
     */
    protected val onItemClick: OnItemClickListener?
        get() = (adapter as? AbstractArrayRecyclerAdapter<*, *>)?.onItemClickListener

    /**
     * OnItemLongClick definition
     */
    protected val onItemLongClick: OnItemLongClickListener?
        get() = (adapter as? AbstractArrayRecyclerAdapter<*, *>)?.onItemLongClickListener
}