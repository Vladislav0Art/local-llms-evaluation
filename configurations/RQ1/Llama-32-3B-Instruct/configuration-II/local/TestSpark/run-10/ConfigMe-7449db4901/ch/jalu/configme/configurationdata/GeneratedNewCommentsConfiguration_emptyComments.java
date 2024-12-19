package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNewCommentsConfiguration_emptyComments {

    @Test
    public void newCommentsConfiguration_emptyComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, configuration.getAllComments().size());
    }

}