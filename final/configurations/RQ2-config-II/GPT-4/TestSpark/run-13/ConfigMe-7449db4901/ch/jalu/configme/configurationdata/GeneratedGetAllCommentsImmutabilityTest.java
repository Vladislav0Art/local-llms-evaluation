package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsImmutabilityTest {

    @Test
    public void getAllCommentsImmutabilityTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("test.path", Arrays.asList("Old Comment Line 1", "Old Comment Line 2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Add a new comment directly to the returned map
        allComments.put("new.path", Arrays.asList("New Comment Line 1", "New Comment Line 2"));

        // The new comment should not appear in the original CommentsConfiguration instance
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}