package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Collections.singletonList("comment"));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = Collections.emptyMap();
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}