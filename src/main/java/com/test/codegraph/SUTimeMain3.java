package com.test.codegraph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SUTimeMain2 {

    public void check() {
        List<Map<Integer, Integer>> timexes = new ArrayList<>();
        Map<Integer, Integer> testMap = new HashMap();
        testMap.put(1, 1);
        timexes.add(testMap);
        if (timexes != null) {
            for (Map t : timexes) {
                Map timex = t;
                System.out.println(timex);
            }
        }
    }

}
