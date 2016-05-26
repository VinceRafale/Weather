package me.santong.weather.contracts;

import android.os.Bundle;

import me.santong.weather.framework.BaseUserListener;
import me.santong.weather.framework.BaseView;

/**
 * Created by santong.
 * At 16/5/26 14:57
 */
public interface HomeContract {
    interface View extends BaseView {
        void init();

        void data4CurrentFgmt(Bundle bundle);

        void data4DailyFgmt(Bundle bundle);

        void data4HourlyFgmt(Bundle bundle);

        void data4DetailFgmt(Bundle bundle);
    }

    interface UserListener extends BaseUserListener {
        void LoadWeather();

    }
}
