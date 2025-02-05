package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "This is a comment.");
        config.setComment("path1", "This is a new comment.");

        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();
        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList("This is a new comment."), allComments.get("path1"));
    }

}