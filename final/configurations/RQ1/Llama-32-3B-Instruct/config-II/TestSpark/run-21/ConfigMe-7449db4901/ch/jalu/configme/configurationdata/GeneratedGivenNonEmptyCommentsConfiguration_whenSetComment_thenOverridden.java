package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenNonEmptyCommentsConfiguration_whenSetComment_thenOverridden {

    @Test
    public void givenNonEmptyCommentsConfiguration_whenSetComment_thenOverridden() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Collections.singletonList("value1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("key2", "comment");
        assertEquals(1, configuration.comments.size());
    }

}