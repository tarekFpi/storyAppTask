package com.example.mydevesstream.viewModel;

import com.example.mydevesstream.repository.StoryRepository;
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
public final class StoryViewModel_Factory implements Factory<StoryViewModel> {
  private final Provider<StoryRepository> repositoryProvider;

  public StoryViewModel_Factory(Provider<StoryRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public StoryViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static StoryViewModel_Factory create(Provider<StoryRepository> repositoryProvider) {
    return new StoryViewModel_Factory(repositoryProvider);
  }

  public static StoryViewModel newInstance(StoryRepository repository) {
    return new StoryViewModel(repository);
  }
}
