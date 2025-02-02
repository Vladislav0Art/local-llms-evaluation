package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testSpan1() {
        int[] spans = {1, 2, 3};
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

    @Test
    public void testSpan2() {
        int[] spans = {4, 5, 6};
        assertEquals(4, spans[0]);
        assertEquals(5, spans[1]);
        assertEquals(6, spans[2]);
    }
}

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