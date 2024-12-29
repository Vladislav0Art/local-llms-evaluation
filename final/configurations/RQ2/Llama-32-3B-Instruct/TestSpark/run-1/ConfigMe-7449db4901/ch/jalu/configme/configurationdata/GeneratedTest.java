package ch.jalu.configme.configurationdata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedTest {

    public static List<String> asList(String... strings) {
        return Arrays.asList(strings);
    }

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_fromMap_isNotEmpty() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertFalse(configuration.getAllComments().isEmpty());
    }

    @Test
    public void setComment_addsNewLineWithoutMarker() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String[] commentLines = {"", "", ""};
        configuration.setComment("path1", commentLines);
        assertEquals(2, configuration.getAllComments().get("path1").size());
    }

    @Test
    public void newCommentsConfiguration_fromMap_isNotEmpty() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", asList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertFalse(configuration.getAllComments().isEmpty());
    }

    @Test
    public void setComment_overwritesExistingComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", asList("", "comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String[] commentLines = {"", "", "newComment"};
        configuration.setComment("path1", commentLines);
        assertEquals(asList(commentLines), configuration.getAllComments().get("path1"));
    }

    @Test
    public void setComment_addsNewEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String[] commentLines = {"", "newComment"};
        configuration.setComment("path1", commentLines);
        assertEquals(asList(commentLines), configuration.getAllComments().get("path1"));
    }

}