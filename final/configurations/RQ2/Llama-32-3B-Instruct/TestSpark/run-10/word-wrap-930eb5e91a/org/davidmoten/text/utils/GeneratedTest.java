package org.davidmoten.text.utils;

public class GeneratedTest {

    private String wrappedText;
    private Set<Character> extraWordChars;

    public WordWraper() {
    }

    public void setExtraWordChars(Set<Character> extraWordChars) {
        this.extraWordChars = extraWordChars;
    }

    public String wrap(String text, int width) {
        // implement the word wrapping logic here
        wrappedText = "";
        return wrappedText;
    }
}

public class GeneratedTest extends TestCase {

    @Test
    public void fromReaderShouldReturnAValidBuilder() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        assertEquals(WordWrap.Builder.class, WordWrap.from(reader).getClass());
    }

    @Test
    public void fromClasspathUtf8ResourceShouldReturnAValidBuilder() {
        String resource = "test.txt";
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspathUtf8(resource).getClass());
    }

    @Test
    public void fromClasspathUtf8ResourceWithCloseShouldNotThrowAnyException() {
        String resource = "test.txt";
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            WordWrap.from(reader, true);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    public void fromClasspathUtf8ResourceShouldNotThrowAnyException() {
        String resource = "test.txt";
        try {
            WordWrap.fromClasspathUtf8(resource);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    public void isWhitespaceShouldReturnTrueForWhitespace() {
        assertTrue(WordWrap.isWhitespace("\n"));
    }

}