package vn.com.it.truongpham.demoapp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    private  var selectedFragment:BaseFragment ?= null

    lateinit var fragmentManager: androidx.fragment.app.FragmentManager
    var viewContainer = android.R.id.content
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                addFragment(FragmentOne())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                addFragment(FragmentTwo())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                addFragment(FragmentThree())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        addFragment(FragmentOne())
    }

    fun addFragment(fragment: androidx.fragment.app.Fragment) {
        fragmentManager=supportFragmentManager
        var fragmentTransaction: androidx.fragment.app.FragmentTransaction =fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container ,fragment)
            .commit()
    }



}
