package org.jsoup.nodes;

public class GeneratedNewNodeText_GivenBlankString_CreatedCorrectly {

    @Test
    public void newNodeText_GivenBlankString_CreatedCorrectly() {
        // given
        String text = "";
        TextNode node = new TextNode(text);

        // when
        assertEquals("", node.text());

        // then
        assertNotNull(node);
    }

}