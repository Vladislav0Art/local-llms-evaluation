package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsUnmodifiableTest {

    @Test
    public void getAllCommentsUnmodifiableTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        try {
            allComments.put("path2", Collections.singletonList("comment2"));
            assertTrue("Expected UnsupportedOperationException not thrown", false);
        } catch (UnsupportedOperationException e) {
            // Exception expected
        }
    }

}