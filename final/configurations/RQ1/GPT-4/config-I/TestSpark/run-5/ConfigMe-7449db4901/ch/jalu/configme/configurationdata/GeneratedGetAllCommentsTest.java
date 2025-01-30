package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("existing.path", Arrays.asList("existing comment 1", "existing comment 2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(2, allComments.get("existing.path").size());
        assertEquals("existing comment 1", allComments.get("existing.path").get(0));
        assertEquals("existing comment 2", allComments.get("existing.path").get(1));
    }

}