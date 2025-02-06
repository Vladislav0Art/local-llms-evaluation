package org.jsoup.nodes;

public class GeneratedNodeName_NullPointerExceptionTest {

    @Test
    public void nodeName_NullPointerExceptionTest() {
        try {
            new TextNode(null).nodeName();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}