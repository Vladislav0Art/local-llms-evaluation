package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = (TextNode) original.clone();
        assertNotNull(cloned);
        assertTrue(original.text().equals(cloned.text()));
    }

}