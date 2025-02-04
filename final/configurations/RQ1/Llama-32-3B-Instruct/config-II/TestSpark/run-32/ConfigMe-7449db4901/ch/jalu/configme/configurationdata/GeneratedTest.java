package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNull(config.comments);
    }

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config.comments);
        assertEquals(comments, config.comments);
    }

    @Test
    public void setCommentWithSingleLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {"line1\n", "line2"};
        config.setComment(path, commentLines);
        List<String> expected = Arrays.asList("line1", "line2");
        assertEquals(expected, config.comments.get(path));
    }

    @Test
    public void setCommentWithMultipleLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {"line1\n", "line2"};
        config.setComment(path, commentLines);
        List<String> expected = Arrays.asList("line1", "line2");
        assertEquals(expected, config.comments.get(path));
    }

    @Test
    public void setCommentWithEmptyLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {"\n"};
        config.setComment(path, commentLines);
        List<String> expected = Collections.emptyList();
        assertEquals(expected, config.comments.get(path));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line11", "line12"));
        config.comments.put("path1", comments.get("path1"));
        config.comments.put("path2", Collections.emptyList());
        assertEquals(comments, config.getAllComments().get("path1"));
    }

    @Test
    public void getAllCommentsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNull(config.getAllComments());
    }

}