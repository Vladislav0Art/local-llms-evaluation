package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("newPath", "newComment1", "newComment2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("newPath", Arrays.asList("newComment1", "newComment2"));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}