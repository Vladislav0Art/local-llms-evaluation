package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path", Arrays.asList("initialComment1", "initialComment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("path", "newComment");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Collections.singletonList("newComment"));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}