package vn.com.it.truongpham.demoapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class FragmentUtils {

    companion object {




        fun replaceFragment(fragment: Fragment ,fragmentManager : FragmentManager,container : Int){
            var fragmentTransaction: androidx.fragment.app.FragmentTransaction =fragmentManager.beginTransaction()
            fragmentTransaction.replace(container,fragment).addToBackStack(null).commit()
        }
    }

}