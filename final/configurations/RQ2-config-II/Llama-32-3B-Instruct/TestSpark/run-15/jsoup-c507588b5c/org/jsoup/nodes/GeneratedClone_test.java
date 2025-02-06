package org.jsoup.nodes;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        TextNode node = new TextNode("Hello");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node.text(), cloned.text());
    }

}