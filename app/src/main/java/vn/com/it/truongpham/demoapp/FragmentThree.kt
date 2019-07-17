package vn.com.it.truongpham.demoapp


import android.os.Bundle
import android.util.Log
import android.view.View

import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_three.view.*

class FragmentThree : BaseFragment()  {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val arrayData = listOf<String>("1", "2", "3", "4", "5", "6", "7", "8", "9")
        val arrayAdapter = ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, arrayData)
        val viewThree=viewbase
        viewThree!!.lvData.adapter = arrayAdapter


        viewThree!!.lvData.setOnItemClickListener { parent, view, position, id ->
            val model = ViewModelProviders.of(this).get(ShareViewModel::class.java)
            when (position) {
                0 -> {
                    model.select(data = position)
                    FragmentUtils.replaceFragment(FragmentDetail() , fragmentManager!!,R.id.container_three)
                }
                1 -> {
                    model.select(position)
                    FragmentUtils.replaceFragment(FragmentTwo() , fragmentManager!!,R.id.container_three)
                }
                2 -> {
                    model.select(position)
                }

                3 -> {

                }
            }
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("FragmentThree","onViewCreated()")
    }
    override fun onStart() {
        super.onStart()
        Log.d("FragmentThree","onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentThree","onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentThree","onPause")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FragmentThree","onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentThree","onDestroy")
    }


    override fun getLayout(): Int {
        return R.layout.fragment_three
    }







}
