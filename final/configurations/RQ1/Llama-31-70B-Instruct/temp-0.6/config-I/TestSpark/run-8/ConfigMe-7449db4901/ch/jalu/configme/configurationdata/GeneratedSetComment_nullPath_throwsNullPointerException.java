package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

public class GeneratedSetComment_nullPath_throwsNullPointerException {

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        // arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // act
        commentsConfiguration.setComment(null, new String[]{"comment1", "comment2"});
    }

}