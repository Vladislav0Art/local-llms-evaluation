package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationIsUnmodifiable {

    @Test
    public void commentsConfigurationIsUnmodifiable() {
        var config = new CommentsConfiguration();
        config.setComment("test", "comment1");
        try {
            config.comments.put("test", Arrays.asList("new comment"));
            fail("Expected exception was not thrown.");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

}