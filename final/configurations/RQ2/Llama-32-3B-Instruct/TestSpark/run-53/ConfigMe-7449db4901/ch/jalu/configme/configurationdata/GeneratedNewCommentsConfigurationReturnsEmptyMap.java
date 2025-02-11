package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfigurationReturnsEmptyMap {

    @Test
    public void newCommentsConfigurationReturnsEmptyMap() {
        CommentsConfiguration commentConfig = new CommentsConfiguration();
        assertNotNull(commentConfig.getAllComments());
        assertTrue(commentConfig.getAllComments().isEmpty());
    }

}