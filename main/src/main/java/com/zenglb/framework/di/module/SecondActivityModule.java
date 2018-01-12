package com.zenglb.framework.di.module;

import com.zenglb.framework.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.Provides;

/**
 *
 *
 *
 */
@Module
public abstract class SecondActivityModule {

    @Provides
    static String provideName() {
        return SecondActivity.class.getName();
    }

}
