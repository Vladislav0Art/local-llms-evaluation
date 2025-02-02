package org.jsoup.nodes;

public class GeneratedTestTextLength {

    @Test
    public void testTextLength() {
        Node node = new Node("Hello");
        assertEquals(5, node.getText().length());
    }

}