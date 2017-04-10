package com.marktony.zhihudaily.homepage;

import com.marktony.zhihudaily.bean.GuokrHandpickNews;
import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;

import java.util.ArrayList;

public interface GuokrContract {

    interface View extends BaseView<Presenter> {

        void showError();

        void showResults(ArrayList<GuokrHandpickNews.result> list);

        void showLoading();

        void stopLoading();

    }

    interface Presenter extends BasePresenter{

        void loadPosts();

        void refresh();

        void startReading(int position);

    }

}
