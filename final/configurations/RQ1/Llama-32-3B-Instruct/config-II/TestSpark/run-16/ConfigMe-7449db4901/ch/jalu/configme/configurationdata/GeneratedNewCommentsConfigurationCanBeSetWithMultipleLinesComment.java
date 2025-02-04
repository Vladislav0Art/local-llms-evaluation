package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewCommentsConfigurationCanBeSetWithMultipleLinesComment {

    @Test
    public void newCommentsConfigurationCanBeSetWithMultipleLinesComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "comment1", "comment2");
        assertEquals(2, configuration.getCommentCount());
    }

}