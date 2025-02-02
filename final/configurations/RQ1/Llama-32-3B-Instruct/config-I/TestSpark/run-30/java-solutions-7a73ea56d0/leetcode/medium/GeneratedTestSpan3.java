package leetcode.medium;

public class GeneratedTestSpan3 {

    @Test
    public void testSpan3() {
        String s = "hello";
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        int[] spans = getSpans(chars, 'h', 'e');
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
    }

    private int[] getSpans(char[] chars, char start, char end) {
        int startIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == start && i > startIndex) {
                break;
            }
            startIndex++;
        }

        int endIndex = chars.length - 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == end && i < endIndex) {
                break;
            }
            endIndex--;
        }

        return new int[]{startIndex, endIndex};
    }
}

}