package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path4", "comment for path 4");
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey("path4"));
        assertEquals(Collections.singletonList("comment for path 4"), allComments.get("path4"));
    }

}