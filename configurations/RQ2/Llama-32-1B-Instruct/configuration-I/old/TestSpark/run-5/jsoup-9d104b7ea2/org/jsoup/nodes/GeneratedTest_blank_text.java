package org.jsoup.nodes;

public class GeneratedTest_blank_text {

    @Test
    public void test_blank_text() {
        TextNode node = new TextNode("");
        assertEquals(false, node.isBlank());
    }

}