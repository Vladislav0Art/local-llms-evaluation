package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path5", "comment5");
        commentsConfiguration.setComment("path6", "comment6");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals("There should be two elements", 2, allComments.size());
        assertEquals("Comment for path5 should match", "comment5", allComments.get("path5").get(0));
        assertEquals("Comment for path6 should match", "comment6", allComments.get("path6").get(0));
    }

}