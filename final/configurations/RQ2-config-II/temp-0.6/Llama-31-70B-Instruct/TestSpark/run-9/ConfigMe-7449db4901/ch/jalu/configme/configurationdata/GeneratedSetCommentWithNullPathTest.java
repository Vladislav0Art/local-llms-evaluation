package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithNullPathTest {

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, "comment"));
    }

}