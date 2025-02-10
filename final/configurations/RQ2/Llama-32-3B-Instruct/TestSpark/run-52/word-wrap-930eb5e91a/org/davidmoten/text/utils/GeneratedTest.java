package org.davidmoten.text.utils;

public class GeneratedTest {

    @Test
    public void fromReader_EmptyText_BuilderShouldReturnBuilder() {
        Preconditions.checkNotNull(new WordWrap.Builder().from(new ArrayList<>()));
    }

    @Test
    public void fromClasspathUtf8_NullResource_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().fromClasspathUtf8(null));
    }

    @Test
    public void fromReader_NullReader_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().from(new Object[0]));
    }

    @Test
    public void fromUtf8_NullInputStream_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().fromUtf8(null));
    }

    @Test
    public void wordWrap_EmptyText_NoWordWrappingNeeded() throws IOException {
        Preconditions.checkNotNull(WordWrap.wordWrap(new ArrayList<>(), new StringBuilder(), "\n", 10L,
                s -> 0L, new HashSet<>(), false, false));
    }

    @Test
    public void fromReader_BreakWords_LinesWrappedCorrectly() throws IOException {
        WordWrap.Builder builder = new WordWrap.Builder();
        Preconditions.checkNotNull(builder.from(new ArrayList<>()));
        StringBuilder out = new StringBuilder();
        Preconditions.checkNotNull(WordWrap.wordWrap(builder.in(), out, "\n", 10L,
                s -> s.length(), new HashSet<>(List.of(' ')), true, true));
        Preconditions.assertTrue(out.toString().contains("\n"));
    }

    @Test
    public void wordWrap_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.wordWrap(null, new StringBuilder(), "\n", 10L,
                s -> s.length(), new HashSet<>(), false, true));
    }

    @Test
    public void fromClasspathUtf8_NullResource_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().fromClasspathUtf8(null));
    }

    @Test
    public void wordWrap_MultilineText_LinesWrappedCorrectly() throws IOException {
        WordWrap.Builder builder = new WordWrap.Builder();
        Preconditions.checkNotNull(builder.from(new ArrayList<>()));
        StringBuilder out = new StringBuilder();
        Preconditions.checkNotNull(WordWrap.wordWrap(builder.in(), out, "\n", 10L,
                s -> s.length(), new HashSet<>(List.of(' ')), false, true));
        Preconditions.assertTrue(out.toString().contains("\n"));
    }

    @Test
    public void wordWrap_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.wordWrap(null, null, "\n", 10L,
                s -> s.length(), new HashSet<>(), false, true));
    }

    @Test
    public void rightTrim_EmptyText_ReturnsEmptyCharSequence() {
        Preconditions.checkNotNull(WordWrap.rightTrim(""));
    }

    @Test
    public void rightTrim_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.rightTrim(null));
    }

    @Test
    public void leftTrim_NullStringBuilder_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.leftTrim(null));
    }

    @Test
    public void isWhitespace_EmptyText_ReturnsTrue() {
        Preconditions.assertTrue(WordWrap.isWhitespace(""));
    }

    @Test
    public void isWhitespace_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.isWhitespace(null));
    }

}