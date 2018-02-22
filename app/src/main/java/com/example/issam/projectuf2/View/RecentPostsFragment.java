package com.example.issam.projectuf2.View;

import com.google.firebase.database.Query;

/**
 * Created by issam on 13/02/2018.
 */

public class RecentPostsFragment extends PostListFragment {git
    Query setQuery(){
        return mReference.child("posts/all-posts");
    }
}
