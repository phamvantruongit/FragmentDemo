package vn.com.it.truongpham.demoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShareViewModel : ViewModel() {
    private val selected= MutableLiveData<Int>()

    fun select(data:Int){
        selected.value=data
    }

    fun getSelected() : LiveData<Int> ?{
        return selected
    }
}