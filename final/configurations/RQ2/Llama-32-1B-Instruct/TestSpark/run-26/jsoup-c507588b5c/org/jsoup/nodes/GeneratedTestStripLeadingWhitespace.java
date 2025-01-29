package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String input = "";
        int result = TestUtils.stripLeadingWhitespace(input);
        assertEquals(0, result); // Should be 0
    }

}