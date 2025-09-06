package com.example.mydevesstream.repository;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NewsRepository_Factory implements Factory<NewsRepository> {
  private final Provider<Context> contextProvider;

  public NewsRepository_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NewsRepository get() {
    return newInstance(contextProvider.get());
  }

  public static NewsRepository_Factory create(Provider<Context> contextProvider) {
    return new NewsRepository_Factory(contextProvider);
  }

  public static NewsRepository newInstance(Context context) {
    return new NewsRepository(context);
  }
}
