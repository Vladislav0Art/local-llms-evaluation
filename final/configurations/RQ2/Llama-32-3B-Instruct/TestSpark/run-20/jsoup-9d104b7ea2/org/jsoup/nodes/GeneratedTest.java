package org.jsoup.nodes;

public class GeneratedTest {

    @BeforeAll
    public static void init() {
        // Nothing to initialize here.
    }

    @AfterAll
    public static void tearDown() {
        // Nothing to clean up here.
    }

    @Test
    public void testStringIsEqualsToItself() {
        String input = "Hello World";
        assertEquals(input, input);
    }

    @Test
    public void testStripLeadingWhitespace() {
        String input = "   Hello World  ";
        String expectedOutput = "Hello World";

        String result = StringUtil.stripLeadingWhitespace(input);

        assertTrue(result.equals(expectedOutput));
    }
}

public class StringUtil {

    public static String stripLeadingWhitespace(String text) {
        return text.trim();
    }

}