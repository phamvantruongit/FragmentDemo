package vn.com.it.truongpham.demoapp


import android.os.Bundle
import android.util.Log
import android.view.View

import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_three.view.*

class FragmentThree : BaseFragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val arrayData = listOf<String>("1", "2", "3", "4", "5", "6", "7", "8", "9")
        val arrayAdapter = ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, arrayData)
        val viewThree = view_base_fragment
        viewThree!!.lvData.adapter = arrayAdapter


        viewThree!!.lvData.setOnItemClickListener { parent, view, position, id ->
            val model = ViewModelProviders.of(this).get(ShareViewModel::class.java)
            when (position) {
                0 -> {
                    model.select(data = position)
                    FragmentUtils.replaceFragment(FragmentDetail(), fragmentManager!!, R.id.container_three)
                }
                1 -> {
                    model.select(position)
                    FragmentUtils.replaceFragment(FragmentTwo(), fragmentManager!!, R.id.container_three)
                }
                2 -> {
                    model.select(position)
                }

                3 -> {

                }
            }
        }

        setTitle("", false)
    }

    override fun getLayout(): Int {
        return R.layout.fragment_three
    }


}
