package org.jsoup.nodes;

public class GeneratedTest_stripped_leading_whitespace {

    @Test
    public void test_stripped_leading_whitespace() {
        String text = "   Hello World";
        TextNode node = stripLeadingWhitespace(TextNode.normaliseWhitespace(text));
        assertEquals("Hello World", node.text());
    }

}