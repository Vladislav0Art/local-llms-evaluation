package org.jsoup.nodes;

public class GeneratedToStringShouldReturnOuterHtmlStringOfComment {

    @Test
    public void toStringShouldReturnOuterHtmlStringOfComment() {
        Comment comment = new Comment("<!-- data -->");
        String expectedOutput = "<!--data-->";
        assertEquals(expectedOutput, comment.toString());
    }

}