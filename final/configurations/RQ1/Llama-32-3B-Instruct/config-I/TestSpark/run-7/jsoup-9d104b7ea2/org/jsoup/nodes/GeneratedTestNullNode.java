package org.jsoup.nodes;

public class GeneratedTestNullNode {

    @Test
    public void testNullNode() {
        try {
            Node node = null;
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected exception
        }
    }

}