package vn.com.it.truongpham.demoapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_toolbar.*




abstract class BaseFragment : Fragment() ,OnBackPressed {
    //https://medium.com/@Wingnut/onbackpressed-for-fragments-357b2bf1ce8e

    var viewbase: View? = null
    lateinit var navi: BottomNavigationView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewbase = inflater.inflate(getLayout(), container, false)

        navi = activity!!.findViewById(R.id.navigation) as BottomNavigationView


        return viewbase
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ivback.setOnClickListener {
            onBackPressed()
        }
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

    fun showImageBack(){
        ivback.visibility=View.VISIBLE
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.d("BaseFragment", "onResume()")
    }


    override fun onBackPressedFragment() {
        val fragments = fragmentManager!!.getFragments()
        for (f in fragments) {
            if (f != null && f is BaseFragment)
                (f as BaseFragment).onBackPressedFragment()
        }
    }

    fun onBackPressed(){
        getActivity()!!.getSupportFragmentManager().popBackStack()
    }

}