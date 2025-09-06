package com.example.mydevesstream.repository;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class StoryRepository_Factory implements Factory<StoryRepository> {
  private final Provider<Context> contextProvider;

  public StoryRepository_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public StoryRepository get() {
    return newInstance(contextProvider.get());
  }

  public static StoryRepository_Factory create(Provider<Context> contextProvider) {
    return new StoryRepository_Factory(contextProvider);
  }

  public static StoryRepository newInstance(Context context) {
    return new StoryRepository(context);
  }
}
