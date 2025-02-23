package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   \t\n   some text";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        assertEquals(strippedText, "some text");
    }

}