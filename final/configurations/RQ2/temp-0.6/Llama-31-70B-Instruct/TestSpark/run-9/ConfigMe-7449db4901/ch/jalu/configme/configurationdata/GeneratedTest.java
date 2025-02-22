package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCommentValidPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Arrays.asList("line1", "line2"));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentInvalidPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "line1", "line2");
    }

    @Test
    public void setCommentInvalidCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", (String[]) null);
    }

}