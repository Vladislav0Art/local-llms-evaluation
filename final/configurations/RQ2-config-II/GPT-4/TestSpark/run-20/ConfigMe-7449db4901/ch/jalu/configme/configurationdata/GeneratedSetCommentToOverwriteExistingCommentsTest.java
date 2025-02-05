package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentToOverwriteExistingCommentsTest {

    @Test
    public void setCommentToOverwriteExistingCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("key", "newComment1", "newComment2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("key", Arrays.asList("newComment1", "newComment2"));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}