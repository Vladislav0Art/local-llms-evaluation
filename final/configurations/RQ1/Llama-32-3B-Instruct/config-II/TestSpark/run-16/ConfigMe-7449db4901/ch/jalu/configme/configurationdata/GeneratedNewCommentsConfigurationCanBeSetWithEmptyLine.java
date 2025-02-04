package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewCommentsConfigurationCanBeSetWithEmptyLine {

    @Test
    public void newCommentsConfigurationCanBeSetWithEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "\n");
        assertEquals(0, configuration.getCommentCount());
    }

}