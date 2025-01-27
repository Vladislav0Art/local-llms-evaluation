package org.jsoup.nodes;

public class GeneratedNodeNameReturnsCorrectName {

    private static final String TEST_DATA = "test data";

    @Test
    public void nodeNameReturnsCorrectName() {
        Comment comment = new Comment("");
        String name = comment.nodeName();
        assertEquals("", name);
    }

}