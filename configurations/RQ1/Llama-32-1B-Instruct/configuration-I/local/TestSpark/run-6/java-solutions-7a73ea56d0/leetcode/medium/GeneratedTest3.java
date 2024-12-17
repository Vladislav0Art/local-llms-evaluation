package leetcode.medium;

public class GeneratedTest3 {

    @Test
    public void test3() {
        assertEquals(new int[][]{{new int[]{1, 2, 3, 4}}, new int[]{5, 6}}, actualSpans);
    }
}

class Solution {

    public List<Integer> findSpans(List<List<Integer>> expectedSpans, List<List<Integer>> actualSpans) {
        for (List<int[]> expectedSpan : expectedSpans) {
            List<int[]> actualSpan = new ArrayList<>();
            for (int[] actualSpan2 : actualSpans) {
                for (int[] actualSpan3 : actualSpan2) {
                    if (areListsEqual(expectedSpan, actualSpan3)) {
                        actualSpan.add(actualSpan3);
                    }
                }
            }
            List<Integer> result = new ArrayList<>();
            for (int[] actualSpan4 : actualSpan) {
                for (int element : actualSpan4) {
                    result.add(element);
                }
            }
            Collections.sort(result);
            return result;
        }

        return null; // if no equal spans are found
    }

    private boolean areListsEqual(List<int[]> expectedSpan, List<int[]> actualSpan) {
        for (int[] expectedElement : expectedSpan) {
            for (int actualElement : actualSpan) {
                if (!areListsEqual(expectedElement, actualElement)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean areListsEqual(int[] expectedList1, int[] actualList1) {
        if (expectedList1.length != actualList1.length) {
            return false;
        }
        for (int i = 0; i < expectedList1.length; i++) {
            if (!Objects.equals(expectedList1[i], actualList1[i])) {
                return false;
            }
        }
        return true;
    }

}