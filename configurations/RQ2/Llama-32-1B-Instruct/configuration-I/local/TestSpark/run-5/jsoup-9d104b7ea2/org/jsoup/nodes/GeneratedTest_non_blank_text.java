package org.jsoup.nodes;

public class GeneratedTest_non_blank_text {

    @Test
    public void test_non_blank_text() {
        TextNode node = new TextNode("Hello World");
        assertEquals(true, node.isBlank());
    }

}