package com.example.mydevesstream.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\b\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\rH\u0002J \u0010\u001b\u001a\u00020\u000f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0007J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/mydevesstream/adapter/NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mydevesstream/adapter/NewsAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "newsList", "Ljava/util/ArrayList;", "LNewsData;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "clickListener", "Lcom/example/mydevesstream/adapter/NewsAdapter$OnItemClickListener;", "listPosition", "", "filterList", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnimation", "view", "Landroid/view/View;", "setNewsList", "list", "setOnItemClick", "listener", "MyViewHolder", "OnItemClickListener", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mydevesstream.adapter.NewsAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<NewsData> newsList;
    private int listPosition = -1;
    @org.jetbrains.annotations.Nullable()
    private com.example.mydevesstream.adapter.NewsAdapter.OnItemClickListener clickListener;
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<NewsData> newsList) {
        super();
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.NotNull()
    com.example.mydevesstream.adapter.NewsAdapter.OnItemClickListener listener) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.mydevesstream.adapter.NewsAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mydevesstream.adapter.NewsAdapter.MyViewHolder holder, int position) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setNewsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<NewsData> list) {
    }
    
    public final void filterList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<NewsData> filterList) {
    }
    
    private final void setAnimation(android.view.View view, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/mydevesstream/adapter/NewsAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "binding", "Lcom/example/mydevesstream/databinding/NewsLayoutBinding;", "(Lcom/example/mydevesstream/adapter/NewsAdapter;Lcom/example/mydevesstream/databinding/NewsLayoutBinding;)V", "getBinding", "()Lcom/example/mydevesstream/databinding/NewsLayoutBinding;", "onClick", "", "v", "Landroid/view/View;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final com.example.mydevesstream.databinding.NewsLayoutBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.mydevesstream.databinding.NewsLayoutBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mydevesstream.databinding.NewsLayoutBinding getBinding() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mydevesstream/adapter/NewsAdapter$OnItemClickListener;", "", "onClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onClick(int position);
    }
}