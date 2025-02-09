package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithNoPreviousCommentTest {

    @Test
    public void setCommentWithNoPreviousCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String comment = "comment";
        commentsConfiguration.setComment(path, comment);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(comment), allComments.get(path));
    }

}