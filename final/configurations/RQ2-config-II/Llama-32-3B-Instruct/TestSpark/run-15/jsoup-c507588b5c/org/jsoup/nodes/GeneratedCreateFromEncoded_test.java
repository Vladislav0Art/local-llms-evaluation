package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_test {

    @Test
    public void createFromEncoded_test() {
        String encodedText = "Hello";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}