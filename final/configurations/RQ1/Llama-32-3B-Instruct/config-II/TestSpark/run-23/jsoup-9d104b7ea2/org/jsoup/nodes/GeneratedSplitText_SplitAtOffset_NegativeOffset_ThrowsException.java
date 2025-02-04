package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtOffset_NegativeOffset_ThrowsException {

    @Test
    public void splitText_SplitAtOffset_NegativeOffset_ThrowsException() {
        String text = "Hello World!";
        int offset = -1;
        try {
            new TextNode(text).splitText(offset);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(0, e.getMessage().indexOf("Split offset must be not be negative"));
        }
    }

}