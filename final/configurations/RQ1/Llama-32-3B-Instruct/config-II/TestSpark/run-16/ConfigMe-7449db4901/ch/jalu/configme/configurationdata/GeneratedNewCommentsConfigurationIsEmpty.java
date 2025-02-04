package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewCommentsConfigurationIsEmpty {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, configuration.getCommentCount());
    }

}