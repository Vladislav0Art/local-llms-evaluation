package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtOffset_OffsetGreaterThanLength_ThrowsException {

    @Test
    public void splitText_SplitAtOffset_OffsetGreaterThanLength_ThrowsException() {
        String text = "Hello World!";
        int offset = 8;
        try {
            new TextNode(text).splitText(offset);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals(0, e.getMessage().indexOf("Split offset must not be greater than current text length"));
        }
    }

}