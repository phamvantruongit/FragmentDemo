package vn.com.it.truongpham.demoapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_toolbar.*




abstract class BaseFragment : Fragment() {
    //https://medium.com/@Wingnut/onbackpressed-for-fragments-357b2bf1ce8e

    var viewbase: View? = null
    lateinit var navi: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewbase = inflater.inflate(getLayout(), container, false)

        navi = activity!!.findViewById<BottomNavigationView>(R.id.navigation)
        return viewbase
    }


    abstract fun getLayout(): Int

    fun setTitle(title: String) {
        tvTitle.text = title
    }

    fun hideBottomNavigationView() {
        navi.visibility = View.GONE
    }

    fun showBottomNavigationView() {
        navi.visibility = View.VISIBLE
    }

    fun addFragment(fragment: Fragment, container: Int, fragmentDetail: String) {

        var fragmentTransaction: androidx.fragment.app.FragmentTransaction = childFragmentManager!!.beginTransaction()
        fragmentTransaction.replace(container, fragment ,fragmentDetail).addToBackStack(fragmentDetail)
            .commit()

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.d("BaseFragment", "onResume()")
    }

}