package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWithMultipleLinesTest {

    @Test
    public void setCommentWithMultipleLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("path1", "comment1", "comment2", "comment3");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList("comment1", "comment2", "comment3"), allComments.get("path1"));
    }

}