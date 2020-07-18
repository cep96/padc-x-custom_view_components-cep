package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO
import kotlinx.android.synthetic.main.view_pod_reaction.view.*

class ReactionViewPods @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {

    private var mDelegate: Delegate ?= null

    override fun onFinishInflate() {
        super.onFinishInflate()
        setUpListener()
    }

    fun setDelegate(delegate: Delegate){
        mDelegate = delegate
    }

    fun bindData(news: NewsVO){
        tvLikedUser.text = news.likedUsers.count().toString()
        tvCommentedUser.text = news.likedUsers.count().toString()
    }

    private fun setUpListener() {
        tvLike.setOnClickListener {

        }

        tvComment.setOnClickListener {

        }

        tvShare.setOnClickListener {
            
        }
    }

    interface Delegate{
        fun onTapLike()
        fun onTapComment()
        fun onTapShare()
    }
}