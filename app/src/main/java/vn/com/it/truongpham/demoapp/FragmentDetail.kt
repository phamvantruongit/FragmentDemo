package vn.com.it.truongpham.demoapp
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_toolbar.*


class FragmentDetail : BaseFragment()   {
    override fun getLayout(): Int {
       return R.layout.fragment_detail
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ModelFragment","onViewCreated")
        hideBottomNavigationView()
    }
    override fun onStart() {
        super.onStart()
        Log.d("ModelFragment","onStart")
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        Log.d("ModelFragment","onPause")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        showBottomNavigationView()
        Log.d("ModelFragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ModelFragment","onDestroy")
    }





}
