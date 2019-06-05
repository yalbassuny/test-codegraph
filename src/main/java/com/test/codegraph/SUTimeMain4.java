package com.test.codegraph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SUTimeMain4 {

    public void check() {
        List<Map<Integer, Integer>> timexes = new ArrayList<>();
        Map<Integer, Integer> testMap = new HashMap();
        testMap.put(1, 1);
        timexes.add(testMap);
        if (timexes != null) {
            for (int i = 0; i < timexes.size(); i++) {
                Map t = timexes.get(i);
                Map timex = t;
                System.out.println(timex);
            }
        }
    }
	
	public static void main(String[] args) throws Exception {
        check();
    }

}
