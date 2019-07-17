package vn.com.it.truongpham.demoapp

import android.os.Bundle


class FragmentOne : BaseFragment() {

    override fun getLayout(): Int {
        return R.layout.fragment_one
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setTitle("Fragment One")


    }
}
