package org.jsoup.nodes;

public class GeneratedClone_CreatesCorrectClone {

    @Test
    public void clone_CreatesCorrectClone() {
        // given
        TextNode node = new TextNode("test");

        // when
        TextNode cloned = node.clone();

        // then
        assertNotNull(cloned);
        assertEquals(node, cloned);
    }

}