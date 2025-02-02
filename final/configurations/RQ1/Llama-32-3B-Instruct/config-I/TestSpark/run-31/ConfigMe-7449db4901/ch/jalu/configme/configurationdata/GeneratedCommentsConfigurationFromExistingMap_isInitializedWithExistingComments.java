package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedCommentsConfigurationFromExistingMap_isInitializedWithExistingComments {

    @Test
    public void commentsConfigurationFromExistingMap_isInitializedWithExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(existingComments);
        assertEquals(existingComments, config.comments);
    }

}