package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String commentLine1 = "testCommentLine1";
        String commentLine2 = "testCommentLine2";
        commentsConfiguration.setComment(path, commentLine1, commentLine2);
        List<String> expectedComments = Arrays.asList(commentLine1, commentLine2);
        assertEquals(expectedComments, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "testPath";
        List<String> commentLines = Arrays.asList("testCommentLine1", "testCommentLine2");
        comments.put(path, commentLines);
        commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}