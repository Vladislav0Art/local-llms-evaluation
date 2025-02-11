package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_isEmpty {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(0, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}