package one.mixin.android.ui.conversation.holder

import android.view.View

class UnknowHolder constructor(containerView: View) : BaseViewHolder(containerView) {
    override fun chatLayout(isMe: Boolean, isLast: Boolean, isBlink: Boolean) {
        super.chatLayout(isMe, isLast, isBlink)
    }

    fun bind() {}
}