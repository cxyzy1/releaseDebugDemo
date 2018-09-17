package com.cxyzy.leakcanary_demo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class LeakManager {
    private static List<Context> list = new ArrayList<>();

    public static void addMe(Context context) {
        list.add(context);
    }
}
