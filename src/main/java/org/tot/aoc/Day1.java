package org.tot.aoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Day1 {

    public int solvePuzzle1(List<String> input) {

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        Integer sum = 0;

        for (String line : input) {
            String[] numbers = line.split("   ");
            leftList.add(Integer.parseInt(numbers[0]));
            rightList.add(Integer.parseInt(numbers[1]));
        }

        Collections.sort(leftList);
        Collections.sort(rightList);

        for (Integer i = 0; i < leftList.size(); i++) {
            sum += Math.abs(leftList.get(i) - rightList.get(i));
        }
        

        return sum;
    }

    public int solvePuzzle2(List<String> input) {

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        // HashMap<Integer, Integer> leftListInstances = new HashMap<>();
        HashMap<Integer, Integer> rightListInstances = new HashMap<>();

        Integer instancesProduct = 0;

        for (String line : input) {
            String[] numbers = line.split("   ");
            leftList.add(Integer.parseInt(numbers[0]));
            rightList.add(Integer.parseInt(numbers[1]));
        }

        for (Integer i = 0; i < rightList.size(); i++) {
            rightListInstances.put(rightList.get(i), (rightListInstances.getOrDefault(rightList.get(i), 0) + 1));
        }

        for (Integer i = 0; i < leftList.size(); i++) {
            if (rightListInstances.containsKey(leftList.get(i))) {
                instancesProduct += (leftList.get(i) * rightListInstances.get(leftList.get(i)));
            }
        }

        return instancesProduct;
    }

}
