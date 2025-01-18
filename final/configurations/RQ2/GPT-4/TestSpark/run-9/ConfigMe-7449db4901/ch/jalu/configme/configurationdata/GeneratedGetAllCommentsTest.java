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
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());

        commentsConfiguration.setComment("path1", "comment 1", "comment 2");
        commentsConfiguration.setComment("path2", "comment 3");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment 1", "comment 2"));
        expectedComments.put("path2", Arrays.asList("comment 3"));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}