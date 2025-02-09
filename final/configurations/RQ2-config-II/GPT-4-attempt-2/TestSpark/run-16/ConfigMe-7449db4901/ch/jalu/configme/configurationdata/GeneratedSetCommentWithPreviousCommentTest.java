package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithPreviousCommentTest {

    @Test
    public void setCommentWithPreviousCommentTest() {
        String path = "path";
        String oldComment = "old comment";
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put(path, Arrays.asList(oldComment));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        String newComment = "new comment";
        commentsConfiguration.setComment(path, newComment);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(newComment), allComments.get(path));
    }

}