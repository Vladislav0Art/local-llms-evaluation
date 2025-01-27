package org.jsoup.nodes;

public class GeneratedCreateTextWithMultipleChars {

    @Test
    public void createTextWithMultipleChars() {
        String text = "abc";
        TextNode node = new MockTextNode(text);
        assertEquals(3, node.text().length());
    }

}