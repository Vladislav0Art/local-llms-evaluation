package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_nullPath_throwsNullPointerException {

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(null, commentLines);
    }

}