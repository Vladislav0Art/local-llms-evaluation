package org.jsoup.nodes;

public class GeneratedNodeNameCommentTest {

    @Test
    public void nodeNameCommentTest() {
        Comment comment = new Comment("testData");
        assertEquals("", comment.nodeName());
    }

}