package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_canBeInitializedWithExistingComments {

    @Test
    public void newCommentsConfiguration_canBeInitializedWithExistingComments() {
        // Given:
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(existingComments);

        // Then:
        assertNotNull(configuration);
    }

}