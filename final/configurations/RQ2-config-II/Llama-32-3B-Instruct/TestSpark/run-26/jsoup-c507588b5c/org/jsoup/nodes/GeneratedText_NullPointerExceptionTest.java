package org.jsoup.nodes;

public class GeneratedText_NullPointerExceptionTest {

    @Test
    public void text_NullPointerExceptionTest() {
        try {
            new TextNode(null).text();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}