package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenNonEmptyCommentsConfiguration_whenNewInstanceCreated_thenMapIsNotEmpty {

    @Test
    public void givenNonEmptyCommentsConfiguration_whenNewInstanceCreated_thenMapIsNotEmpty() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Collections.singletonList("value"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.comments.containsKey("key"));
    }

}