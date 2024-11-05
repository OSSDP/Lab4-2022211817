import org.example.Solution6;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution6Test {

    @Test
    public void testPeopleIndexes_EmptyInput() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPeopleIndexes_NoSubsets() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Arrays.asList(
                Arrays.asList("leetcode", "google", "facebook"),
                Arrays.asList("amazon"),
                Arrays.asList("microsoft")
        );
        List<Integer> expected = Arrays.asList(0, 1, 2);
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPeopleIndexes_WithSubsets() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Arrays.asList(
                Arrays.asList("leetcode", "google", "facebook"),
                Arrays.asList("google", "facebook"),
                Arrays.asList("facebook"),
                Arrays.asList("amazon")
        );
        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPeopleIndexes_AllSubsets() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Arrays.asList(
                Arrays.asList("leetcode"),
                Arrays.asList("leetcode", "google"),
                Arrays.asList("leetcode", "google", "facebook")
        );
        List<Integer> expected = Collections.singletonList(2);
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPeopleIndexes_SingleElementLists() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"),
                Arrays.asList("c")
        );
        List<Integer> expected = Arrays.asList(0, 1, 2);
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPeopleIndexes_LargeInput() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("a", "b"),
                Arrays.asList("a"),
                Arrays.asList("d", "e"),
                Arrays.asList("d"),
                Arrays.asList("f")
        );
        List<Integer> expected = Arrays.asList(0, 3, 5);
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPeopleIndexes_MultipleSubsets() {
        Solution6 solution = new Solution6();
        List<List<String>> input = Arrays.asList(
                Arrays.asList("company1", "company2"),
                Arrays.asList("company2"),
                Arrays.asList("company1"),
                Arrays.asList("company3", "company4"),
                Arrays.asList("company4")
        );
        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> result = solution.peopleIndexes(input);
        assertEquals(expected, result);
    }
}
