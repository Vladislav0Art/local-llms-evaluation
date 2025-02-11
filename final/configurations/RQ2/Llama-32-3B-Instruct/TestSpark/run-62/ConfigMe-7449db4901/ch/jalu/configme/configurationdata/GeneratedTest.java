package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedTest {

    private java.util.Map<String, java.util.List<String>> comments = new java.util.HashMap<>();

    public void setComment(String path, String[] commentLines) {
        comments.put(path, Arrays.asList(commentLines));
    }

    public java.util.List<String> getAllComments() {
        return new java.util.ArrayList<>(comments.values());
    }
}

public class CommentsConfigurationTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(0, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_setComment() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        commentsConfig.setComment(path, commentLines);
        assertEquals(2, commentsConfig.getAllComments().get(path).size());
        assertTrue(commentsConfig.getAllComments().get(path).containsAll(Arrays.asList("line1", "line2")));
    }

    @Test
    public void newCommentsConfiguration_setEmptyLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {""};
        commentsConfig.setComment(path, commentLines);
        assertEquals(0, commentsConfig.getAllComments().get(path).size());
        assertTrue(commentsConfig.getAllComments().get(path).isEmpty());
    }

    @Test
    public void newCommentsConfiguration_setMultiplePaths() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path1 = "path1";
        String[] commentLines1 = {"line1", "line2"};
        String path2 = "path2";
        String[] commentLines2 = {"line3"};
        commentsConfig.setComment(path1, commentLines1);
        commentsConfig.setComment(path2, commentLines2);
        assertEquals(2, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey(path1));
        assertTrue(commentsConfig.getAllComments().containsKey(path2));
    }

}