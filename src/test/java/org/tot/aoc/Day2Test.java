package org.tot.aoc;

import org.junit.Assert;
import org.junit.Test;
import org.tot.helper.ResourceHelper;

import java.util.List;

public class Day2Test {

    @Test
    public void testSample1() {

        List<String> lines = ResourceHelper.loadLinesFromFile("Day1/sample2.txt");

        Day2 day = new Day2();

        int result = day.solvePuzzle1(lines);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testSolution1() {

        List<String> lines = ResourceHelper.loadLinesFromFile("Day1/input1 copy.txt");

        Day2 day = new Day2();

        int result = day.solvePuzzle1(lines);

        Assert.assertEquals(0, result);
    }

    @Test
    public void testSample2() {

        List<String> lines = ResourceHelper.loadLinesFromFile("Day1/sample2.txt");

        Day1 day = new Day1();

        int result = day.solvePuzzle2(lines);

        Assert.assertEquals(31, result);
    }

    @Test
    public void testSolution2() {
        List<String> lines = ResourceHelper.loadLinesFromFile("Day1/input1.txt");

        Day1 day = new Day1();

        int result = day.solvePuzzle2(lines);

        Assert.assertEquals(0, result);
    }

}
