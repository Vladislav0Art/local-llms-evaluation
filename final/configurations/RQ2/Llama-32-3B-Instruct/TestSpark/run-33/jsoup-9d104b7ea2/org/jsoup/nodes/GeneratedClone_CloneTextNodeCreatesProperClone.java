package org.jsoup.nodes;

public class GeneratedClone_CloneTextNodeCreatesProperClone {

    @Test
    public void clone_CloneTextNodeCreatesProperClone() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }
}

}