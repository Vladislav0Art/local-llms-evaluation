package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void trackNewlinesTrue_WhenTrackNewlinesIsTrue() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.trackNewlines(true);

        assertEquals(1, reader.pos());
        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void closeTrue_WhenCloseIsCalled() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.close();

        assertFalse(reader.isTrackNewlines());
    }

    @Test
    public void isTrackNewlinesFalse_WhenNotTrackNewlinesIsTrue() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.trackNewlines(false);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void isEmptyTrue_WhenIsEmpty() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.isEmpty();

        assertTrue(reader.isEmpty());

        reader.mark();
        assertFalse(reader.isEmpty());
    }

    @Test
    public void consumeToCharFalse_WhenNotConsumed() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        String s = reader.consumeTo(c);

        assertEquals("a", s);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void consumeToShortStringTrue_WhenConsumed() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        String s = reader.consumeTo('a');

        assertEquals("a", s);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void consumeToNullStringTrue_WhenConsumed() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        String s = reader.consumeTo(null);

        assertEquals("a", s);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesCharTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        boolean match = reader.matches(c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesStringFalse_WhenNotMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = 'b';
        boolean match = reader.matches(s, c);

        assertFalse(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesIgnoreCaseStringTrue_WhenMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "Hello";
        char c = 'b';
        boolean match = reader.matchesIgnoreCase(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesAnyCharFalse_WhenNotMatchesAny() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        boolean match = reader.matchesAny(chars);

        assertFalse(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesAnySortedCharFalse_WhenNotMatchesAnySorted() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        boolean match = reader.matchesAnySorted(chars);

        assertFalse(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesLetterTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = 'a';
        boolean match = reader.matches(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesAsciiAlphaTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = 'a';
        boolean match = reader.matches(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesDigitTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = '1';
        boolean match = reader.matches(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

    @Test
    public void matchesConsumeStringTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.matches(s, '\0'));

        assertEquals(3, sb.length());
    }

    @Test
    public void matchConsumeTrue_WhenMatchConsume() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.matchConsume(s, '\0'));

        assertEquals(3, sb.length());
    }

    @Test
    public void matchConsumeIgnoreCaseStringTrue_WhenMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "Hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.matchConsume(s, '\0'));

        assertEquals(3, sb.length());
    }

    @Test
    public void containsIgnoreCaseStringTrue_WhenContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "Hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.containsIgnoreCase(s, '\0'));

        assertEquals(3, sb.length());
    }

    @Test
    public void rangeEqualsTrue_WhenRangeEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = {4, 5, 6};
        char[] chars2 = {'c', 'd'};

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

    @Test
    public void rangeEqualsFalse_WhenRangeDoesNotEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = {4, 5, 6};
        char[] chars2 = {'c', 'd'};

        assertFalse(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertFalse(reader.rangeEquals(arr1, chars1));
    }

    @Test
    public void rangeEqualsNull_WhenRangeEqualsNull() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = null;
        char[] chars2 = null;

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

    @Test
    public void rangeEqualsEmptyArray_WhenRangeEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = {};
        char[] chars2 = {};

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

    @Test
    public void rangeEqualsEmptyCharArray_WhenRangeEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = new int[0];
        char[] chars2 = new char[0];

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

}