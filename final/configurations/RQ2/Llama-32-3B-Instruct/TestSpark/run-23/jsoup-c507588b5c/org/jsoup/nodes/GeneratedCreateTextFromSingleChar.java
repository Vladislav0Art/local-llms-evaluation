package org.jsoup.nodes;

public class GeneratedCreateTextFromSingleChar {

    @Test
    public void createTextFromSingleChar() {
        String text = "a";
        TextNode node = new MockTextNode(text);
        assertEquals(1, node.text().length());
    }

}