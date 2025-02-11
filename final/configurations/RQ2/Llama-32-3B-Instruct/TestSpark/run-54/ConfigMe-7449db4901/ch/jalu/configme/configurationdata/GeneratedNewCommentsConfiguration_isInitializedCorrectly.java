package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_isInitializedCorrectly {

    @Test
    public void newCommentsConfiguration_isInitializedCorrectly() {
        // Given:
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // Then:
        assertNotNull(configuration);
    }

}