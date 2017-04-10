package com.marktony.zhihudaily.settings;

import android.content.Context;
import android.support.v7.preference.Preference;

import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;

public interface SettingsContract {

    interface View extends BaseView<Presenter> {

        void showCleanGlideCacheDone();

    }

    interface Presenter extends BasePresenter {

        void setNoPictureMode(Preference preference);

        void setInAppBrowser(Preference preference);

        void cleanGlideCache();

        void setTimeOfSavingArticles(Preference preference, Object newValue);

        String getTimeSummary();

    }

}
