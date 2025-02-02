package org.jsoup.nodes;

public class GeneratedSplitText_GivenInvalidOffset_GivesException {

    @Test
    public void splitText_GivenInvalidOffset_GivesException() {
        String text = "test";
        TextNode node = new TextNode(text);
        int offset = -1;
        try {
            node.splitText(offset);
            fail();
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}