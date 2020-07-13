package net.imknown.android.forefrontinfo.ui.prop

import androidx.fragment.app.activityViewModels
import net.imknown.android.forefrontinfo.MyApplication
import net.imknown.android.forefrontinfo.ui.base.BaseListFragment

class PropFragment : BaseListFragment() {

    companion object {
        fun newInstance() = PropFragment()
    }

    override val listViewModel by activityViewModels<PropViewModel>()

    override fun init() {
        observeLanguageEvent(MyApplication.propLanguageEvent)
    }
}