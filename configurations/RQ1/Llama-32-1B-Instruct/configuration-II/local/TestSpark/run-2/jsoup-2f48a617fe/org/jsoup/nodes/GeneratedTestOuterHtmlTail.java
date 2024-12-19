package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private static final Comment COMMENT = new Comment("This is an example comment");

    @Test
    public void testOuterHtmlTail() throws IOException, InterruptedException {
        Comment comment = COMMENT.clone();
        comment.outerHtmlTail(CommentTest::appendToOutput, 0);
        // The tail should be empty for the comment to appear as empty in the output.
        assertEquals("", appendToOutput());
    }

    private static String appendToOutput(Appendable accum) {
        Appendable newAccum = new StringBuilder();
        accum.append("<!--").append(newaccum.toString()).append("-->");
        return newAccum.toString();
    }

}