package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_nullCommentLines_throwsNullPointerException {

    @Test
    public void setComment_nullCommentLines_throwsNullPointerException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        commentsConfiguration.setComment(path, null);
    }

}