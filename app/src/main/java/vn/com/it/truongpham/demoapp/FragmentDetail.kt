package vn.com.it.truongpham.demoapp
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_toolbar.*


class FragmentDetail : BaseFragment()   {
    override fun getLayout(): Int {
       return R.layout.fragment_detail
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hideBottomNavigationView()
        btnStartFragment.setOnClickListener {
            FragmentUtils.replaceFragment(ModelFragment() , fragmentManager!!,R.id.container_detail)
        }
        setTitle("FragmentDetail",true)
        showImageBack()
    }


    override fun onDestroy() {
        super.onDestroy()
        showBottomNavigationView()
    }

}
