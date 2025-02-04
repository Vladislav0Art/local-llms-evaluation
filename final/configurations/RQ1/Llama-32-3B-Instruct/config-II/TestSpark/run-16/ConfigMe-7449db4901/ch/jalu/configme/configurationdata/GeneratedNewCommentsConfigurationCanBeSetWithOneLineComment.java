package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewCommentsConfigurationCanBeSetWithOneLineComment {

    @Test
    public void newCommentsConfigurationCanBeSetWithOneLineComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "comment");
        assertEquals(1, configuration.getCommentCount());
    }

}