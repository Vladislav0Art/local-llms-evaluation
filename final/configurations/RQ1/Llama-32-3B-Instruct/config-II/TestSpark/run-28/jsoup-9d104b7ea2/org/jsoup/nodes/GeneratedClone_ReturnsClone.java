package org.jsoup.nodes;

public class GeneratedClone_ReturnsClone {

    @Test
    public void clone_ReturnsClone() {
        // given
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();

        // when
        TextNode result = (TextNode) cloned.clone();

        // then
        assertNotNull(result);
        assertEquals(original, result);
    }

}