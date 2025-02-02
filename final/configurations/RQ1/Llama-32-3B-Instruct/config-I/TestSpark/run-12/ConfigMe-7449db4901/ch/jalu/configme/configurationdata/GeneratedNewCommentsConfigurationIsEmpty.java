package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class GeneratedNewCommentsConfigurationIsEmpty {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}