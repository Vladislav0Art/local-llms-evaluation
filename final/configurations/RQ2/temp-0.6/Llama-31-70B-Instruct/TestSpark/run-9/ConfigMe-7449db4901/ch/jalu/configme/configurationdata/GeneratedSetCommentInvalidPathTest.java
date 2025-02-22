package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentInvalidPathTest {

    @Test
    public void setCommentInvalidPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "line1", "line2");
    }

}