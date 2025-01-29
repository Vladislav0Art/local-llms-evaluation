package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        TextNode node = new TextNode("   Hello World  ");
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, normalizeWhitespace(node.text()));
        assertEquals("", normalizeWhitespace(""));
    }

}