package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithNullCommentLinesTest {

    @Test
    public void setCommentWithNullCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String[]) null));
    }

}