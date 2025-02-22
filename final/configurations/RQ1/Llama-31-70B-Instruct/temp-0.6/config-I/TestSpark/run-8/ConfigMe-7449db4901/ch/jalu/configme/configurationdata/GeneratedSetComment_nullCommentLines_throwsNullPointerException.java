package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

public class GeneratedSetComment_nullCommentLines_throwsNullPointerException {

    @Test
    public void setComment_nullCommentLines_throwsNullPointerException() {
        // arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";

        // act
        commentsConfiguration.setComment(path, null);
    }

}