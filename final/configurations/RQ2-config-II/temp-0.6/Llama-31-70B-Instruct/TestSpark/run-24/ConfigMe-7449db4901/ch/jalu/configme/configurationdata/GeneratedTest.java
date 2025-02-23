package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testCommentsConfigurationCreatesEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}