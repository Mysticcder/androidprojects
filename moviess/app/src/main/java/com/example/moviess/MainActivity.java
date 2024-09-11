package com.example.moviess;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.example.moviess.Model.BannerMovies;
import com.example.moviess.adapter.BannerMoviesPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerMoviesPagerAdapter bannerMoviesPagerAdapter;
    TabLayout tabLayout;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies> bannerMoviesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerMoviesList = new ArrayList<>();
        bannerMoviesList.add(new BannerMovies(1, "test", "", ""));
        bannerMoviesList.add(new BannerMovies(2, "test", "", ""));
        bannerMoviesList.add(new BannerMovies(3, "test", "", ""));
        bannerMoviesList.add(new BannerMovies(4, "test", "", ""));
        bannerMoviesList.add(new BannerMovies(5, "test", "", ""));


    }
    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){

        bannerMoviesViewPager = findViewById(R.id.banner_ViewPager);
        bannerMoviesPagerAdapter = new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);
    }



    }
