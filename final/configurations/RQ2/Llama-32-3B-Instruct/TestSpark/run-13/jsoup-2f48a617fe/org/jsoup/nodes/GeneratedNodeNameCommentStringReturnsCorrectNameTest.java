package org.jsoup.nodes;

public class GeneratedNodeNameCommentStringReturnsCorrectNameTest {

    @Test
    public void nodeNameCommentStringReturnsCorrectNameTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}