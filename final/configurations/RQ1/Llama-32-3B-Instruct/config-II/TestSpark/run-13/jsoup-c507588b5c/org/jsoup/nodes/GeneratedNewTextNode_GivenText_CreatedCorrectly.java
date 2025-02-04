package org.jsoup.nodes;

public class GeneratedNewTextNode_GivenText_CreatedCorrectly {

    @Test
    public void newTextNode_GivenText_CreatedCorrectly() {
        // given
        String text = "test";
        TextNode node = new TextNode(text);

        // when
        assertEquals(text, node.text());

        // then
        assertNotNull(node);
    }

}