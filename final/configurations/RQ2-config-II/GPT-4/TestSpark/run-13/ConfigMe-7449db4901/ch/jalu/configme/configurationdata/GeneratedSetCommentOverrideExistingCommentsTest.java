package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentOverrideExistingCommentsTest {

    @Test
    public void setCommentOverrideExistingCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("test.path", Arrays.asList("Old Comment Line 1", "Old Comment Line 2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("test.path", "New Comment Line 1", "New Comment Line 2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("New Comment Line 1", "New Comment Line 2"), commentsConfiguration.getAllComments().get("test.path"));
    }

}