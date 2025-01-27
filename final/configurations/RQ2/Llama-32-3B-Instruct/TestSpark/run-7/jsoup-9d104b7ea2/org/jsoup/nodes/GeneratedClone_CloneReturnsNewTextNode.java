package org.jsoup.nodes;

public class GeneratedClone_CloneReturnsNewTextNode {

    @Test
    public void clone_CloneReturnsNewTextNode() {
        String original = "Hello World!";
        TextNode originalNode = new TextNode(original);
        String expected = original;
        TextNode actual = originalNode.clone();
        assertEquals(expected, actual.text());
    }

}