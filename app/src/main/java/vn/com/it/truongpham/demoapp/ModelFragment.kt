package vn.com.it.truongpham.demoapp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.model_fragment.*
import vn.com.it.truongpham.demoapp.ui.model.ModelViewModel

class ModelFragment : Fragment() {


    private lateinit var viewModel: ModelViewModel



    companion object {
        fun newInstance() = ModelFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=inflater.inflate( R.layout.model_fragment,container,false)
        return view
    }




    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ModelViewModel::class.java)
        message.setOnClickListener {
            var fragmentTransaction: androidx.fragment.app.FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.model, FragmentDetail()).addToBackStack(null)
                .commit()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ModelFragment","onViewCreated()")
    }
    override fun onStart() {
        super.onStart()
        Log.d("ModelFragment","onStart()")
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        Log.d("ModelFragment","onPause()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ModelFragment","onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ModelFragment","onDestroy()")
    }



}
