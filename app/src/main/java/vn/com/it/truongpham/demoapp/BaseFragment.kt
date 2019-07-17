package vn.com.it.truongpham.demoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_toolbar.*




abstract class BaseFragment : Fragment()  {
    //https://medium.com/@Wingnut/onbackpressed-for-fragments-357b2bf1ce8e

    var view_base_fragment: View? = null
    lateinit var navigation: BottomNavigationView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view_base_fragment = inflater.inflate(getLayout(), container, false)

        navigation = activity!!.findViewById(R.id.navigation) as BottomNavigationView


        return view_base_fragment
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ivback.setOnClickListener {
            onBackPressed()
        }
    }


    abstract fun getLayout(): Int

    fun setTitle(title: String="",isVisible:Boolean) {
        if(isVisible) {
            tvTitle.visibility=View.VISIBLE
            tvTitle.text = title
        }else{
            tvTitle.visibility=View.GONE
        }
    }

    fun hideBottomNavigationView() {
        navigation.visibility = View.GONE
    }

    fun showBottomNavigationView() {
        navigation.visibility = View.VISIBLE
    }

    fun showImageBack(){
        ivback.visibility=View.VISIBLE
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    fun onBackPressed(){
        getActivity()!!.getSupportFragmentManager().popBackStack()
    }

}