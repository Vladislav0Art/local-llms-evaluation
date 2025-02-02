package leetcode.medium;

public class GeneratedTestSpan4 {

    @Test
    public void testSpan4() {
        String s = "world";
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        int[] spans1 = getSpans(chars, 'w', 'r');
        int[] spans2 = getSpans(chars, 'o', 'l');

        assertEquals(1, spans1[0]);
        assertEquals(5, spans1[1]);

        assertEquals(1, spans2[0]);
        assertEquals(4, spans2[1]);
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