package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNewCommentsConfigurationReturnsEmptyMap {

    @Test
    public void newCommentsConfigurationReturnsEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.isEmpty());
    }

}