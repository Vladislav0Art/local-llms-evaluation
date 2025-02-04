package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentUpdatesExistingEntry {

    @Test
    public void setCommentUpdatesExistingEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "comment1", "comment2");
        configuration.setComment("test", "newComment");
        assertEquals(1, configuration.getCommentCount());
    }

}