package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        MockTextNode textNode = new MockTextNode();
        textNode.text("Hello");
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertTrue(result.value.equals("Hello"));
        assertEquals(1, result.siblingIndex);
    }

}