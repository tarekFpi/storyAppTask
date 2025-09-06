package com.example.mydevesstream.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mydevesstream/viewModel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/mydevesstream/repository/NewsRepository;", "(Lcom/example/mydevesstream/repository/NewsRepository;)V", "_news", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/mydevesstream/utils/Resource;", "LNewsResponse;", "news", "Landroidx/lifecycle/LiveData;", "getNews", "()Landroidx/lifecycle/LiveData;", "loadNews", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.mydevesstream.repository.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.mydevesstream.utils.Resource<NewsResponse>> _news = null;
    
    @javax.inject.Inject()
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mydevesstream.repository.NewsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mydevesstream.utils.Resource<NewsResponse>> getNews() {
        return null;
    }
    
    public final void loadNews() {
    }
}