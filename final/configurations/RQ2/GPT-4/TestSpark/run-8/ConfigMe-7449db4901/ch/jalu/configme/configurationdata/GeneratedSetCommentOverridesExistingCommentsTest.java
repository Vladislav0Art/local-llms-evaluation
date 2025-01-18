package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverridesExistingCommentsTest {

    @Test
    public void setCommentOverridesExistingCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        commentsConfiguration.setComment("path1", "newComment1");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.size());
        assertEquals(Collections.singletonList("newComment1"), allComments.get("path1"));
    }

}