package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_EmptyStringBuilderTest {

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilderTest() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}