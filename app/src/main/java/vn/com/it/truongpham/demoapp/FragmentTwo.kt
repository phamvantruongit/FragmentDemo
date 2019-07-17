package vn.com.it.truongpham.demoapp

import android.os.Bundle

class FragmentTwo :BaseFragment() {


    override fun getLayout(): Int {
       return  R.layout.fragment_two
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setTitle("Fragment Two",true)
    }

}
