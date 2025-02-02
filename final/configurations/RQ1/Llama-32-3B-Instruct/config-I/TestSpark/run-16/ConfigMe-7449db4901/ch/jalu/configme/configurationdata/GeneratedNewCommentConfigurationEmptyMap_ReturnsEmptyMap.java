package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentConfigurationEmptyMap_ReturnsEmptyMap {

    @Test
    public void newCommentConfigurationEmptyMap_ReturnsEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.isEmpty());
    }

}