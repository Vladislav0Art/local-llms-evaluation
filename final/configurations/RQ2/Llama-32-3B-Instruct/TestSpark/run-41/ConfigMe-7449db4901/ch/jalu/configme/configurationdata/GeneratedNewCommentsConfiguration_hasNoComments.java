package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewCommentsConfiguration_hasNoComments {

    @Test
    public void newCommentsConfiguration_hasNoComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}