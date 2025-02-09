package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(commentsConfiguration.getAllComments(), comments);
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        String[] commentLines = new String[]{"line 1", "line 2"};
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(allComments.get(path), Arrays.asList(commentLines));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        comments.put("path2", Arrays.asList("line 2.1", "line 2.2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(allComments, comments);
    }

}