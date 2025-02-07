package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   Hello   World";
        assertEquals("Hello World", stripLeadingWhitespace(text));
    }

}