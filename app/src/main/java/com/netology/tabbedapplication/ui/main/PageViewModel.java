package com.netology.tabbedapplication.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import kotlin.jvm.functions.Function1;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
//    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
//        @Override
//        public String apply(Integer input) {
//            return "Page: " + input;
//        }
//    });

    private LiveData<String> mText = Transformations.map(mIndex, new Function1<Integer, String>() {
        @Override
        public String invoke(Integer input) {
            return "Page: " + input;
        }
    });


    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}