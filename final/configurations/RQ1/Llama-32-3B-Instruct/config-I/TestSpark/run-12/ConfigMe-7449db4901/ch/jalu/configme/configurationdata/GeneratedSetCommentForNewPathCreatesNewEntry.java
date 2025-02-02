package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetCommentForNewPathCreatesNewEntry {

    @Test
    public void setCommentForNewPathCreatesNewEntry() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path2", "newLine1", "newLine2");
        assertTrue(commentsConfiguration.getAllComments().containsKey("path2"));
    }

}