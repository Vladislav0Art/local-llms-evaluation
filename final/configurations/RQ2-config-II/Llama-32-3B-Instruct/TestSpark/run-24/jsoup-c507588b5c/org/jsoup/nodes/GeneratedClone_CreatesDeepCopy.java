package org.jsoup.nodes;

public class GeneratedClone_CreatesDeepCopy {

    @Test
    public void clone_CreatesDeepCopy() {
        TextNode original = new TextNode("Hello World");
        TextNode copy = original.clone();
        assertNotNull(copy);
        assertEquals(original.text(), copy.text());
    }

}