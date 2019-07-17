package vn.com.it.truongpham.demoapp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_toolbar.*
import kotlinx.android.synthetic.main.model_fragment.*
import vn.com.it.truongpham.demoapp.ui.model.ModelViewModel

class ModelFragment : BaseFragment() {
    override fun getLayout(): Int {
        return R.layout.model_fragment
    }


    private lateinit var viewModel: ModelViewModel


    companion object {
        fun newInstance() = ModelFragment()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ModelViewModel::class.java)
        message.setOnClickListener {
            FragmentUtils.replaceFragment(FragmentDetail(), fragmentManager!!, R.id.model)
        }
        showImageBack()

    }


}
