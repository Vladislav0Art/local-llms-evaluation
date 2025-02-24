package org.jsoup.nodes;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Some Text");
        assertEquals("Some Text", textNode.text());
    }

}