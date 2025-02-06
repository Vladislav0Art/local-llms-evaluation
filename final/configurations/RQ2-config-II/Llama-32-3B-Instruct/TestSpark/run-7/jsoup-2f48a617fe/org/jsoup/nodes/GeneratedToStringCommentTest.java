package org.jsoup.nodes;

public class GeneratedToStringCommentTest {

    @Test
    public void toStringCommentTest() {
        Comment comment = new Comment("testData");
        String expected = "<!--testData-->";
        assertEquals(expected, comment.toString());
    }

}