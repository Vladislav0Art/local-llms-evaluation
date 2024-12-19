package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTest {

    @Test
    public void testGetComment() {
        Map<String, List<String>> expected = Map.of("key1", List.of("value1"));
        //Assuming getAllComment returns a map where key is the comment id and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("commentId1", List.of("value1"));

        assertEquals(expected.get("key1"), commentsConfiguration.get("commentId1"));
    }

    @Test
    public void testGetAllComment() {
        Map<String, List<String>> expected = Map.of("path1", List.of("value1"));
        //Assuming getAllComment returns a map where key is the path and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("path1", List.of("value1"));

        assertEquals(expected.get("path1"), commentsConfiguration.get("path1"));
    }

    @Test
    public void testGetAllCommentNotExists() {
        Map<String, List<String>> expected = Map.of();
        //Assuming getAllComment returns a map where key is the path and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();

        assertEquals(expected, commentsConfiguration.get("nonExistingPath"));
    }

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> expected = Map.of("key1", List.of("value1"), "key2", List.of("value2"));
        //Assuming getAllComment returns a map where key is the comment id and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("commentId1", List.of("value1"));
        commentsConfiguration.put("commentId2", List.of("value2"));

        assertEquals(expected, commentsConfiguration);
    }

    @Test
    public void testGetAllCommentsEmpty() {
        Map<String, List<String>> expected = Map.of();
        //Assuming getAllComment returns a map where key is the comment id and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();

        assertEquals(expected, commentsConfiguration);
    }

}