package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWorksAsExpectedForEmptyString {

    @Test
    public void setCommentWorksAsExpectedForEmptyString() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("", "comment");
        assertNotNull(configuration.comments);
        assertEquals(0, configuration.comments.size());
    }

}