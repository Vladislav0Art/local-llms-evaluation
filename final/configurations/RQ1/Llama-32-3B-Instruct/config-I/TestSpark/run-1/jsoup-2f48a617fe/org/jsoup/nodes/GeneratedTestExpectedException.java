package org.jsoup.nodes;

public class GeneratedTestExpectedException {

    private Node node;

    public NodeTest(Node node) {
        this.node = node;
    }

    @Test
    public void testExpectedException() {
        try {
            settings.someMethod();
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Expected exception", e.getMessage());
        }
    }
}

public class CommentTest {
    private String comment;

    public CommentTest(String comment) {
        this.comment = comment;
    }

}