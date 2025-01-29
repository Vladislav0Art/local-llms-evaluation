package org.jsoup.nodes;

public class GeneratedTest_split_text {

    @Test
    public void test_split_text() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals(["Hello", "World"],node.splitText(2));
    }

}