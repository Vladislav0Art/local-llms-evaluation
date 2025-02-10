package org.jsoup.nodes;

public class GeneratedTestCloneCreatesClonedTextNode {

    @Test
    public void testCloneCreatesClonedTextNode() {
        TextNode textNode = new TextNode("abc");
        TextNode cloned = (TextNode) textNode.clone();
        assertNotNull(cloned);
        assertEquals(textNode, cloned);
    }

}