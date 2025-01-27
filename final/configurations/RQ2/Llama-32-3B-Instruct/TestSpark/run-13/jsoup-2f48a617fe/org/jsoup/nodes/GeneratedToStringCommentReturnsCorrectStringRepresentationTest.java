package org.jsoup.nodes;

public class GeneratedToStringCommentReturnsCorrectStringRepresentationTest {

    @Test
    public void toStringCommentReturnsCorrectStringRepresentationTest() {
        Comment comment = new Comment("data");
        assertEquals("<!-- data -->", comment.toString());
    }

}