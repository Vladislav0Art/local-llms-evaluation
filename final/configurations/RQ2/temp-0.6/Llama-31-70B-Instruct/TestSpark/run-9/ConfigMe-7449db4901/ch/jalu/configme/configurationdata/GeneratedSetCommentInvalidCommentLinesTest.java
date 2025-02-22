package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentInvalidCommentLinesTest {

    @Test
    public void setCommentInvalidCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", (String[]) null);
    }

}