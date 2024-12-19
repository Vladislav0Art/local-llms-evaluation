package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedExistingCommentsConfiguration_isInitializedWithExistingComments {

    @Test
    public void existingCommentsConfiguration_isInitializedWithExistingComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration.comments);
        assertEquals(1, commentsConfiguration.comments.size());
    }

}