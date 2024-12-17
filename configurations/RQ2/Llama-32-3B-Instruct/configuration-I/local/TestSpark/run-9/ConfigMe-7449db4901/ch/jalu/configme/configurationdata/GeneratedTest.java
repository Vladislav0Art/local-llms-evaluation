package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.lang.reflect.Field;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertEquals(null, comments.getComments());
    }

    @Test
    public void constructorWithCommentMapTest() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        Object o = field.get(comments);
        assertEquals(1, ((Map<?, ?>) o).size());
    }

    @Test
    public void setCommentTest() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        String path = "testPath";
        String[] commentLines = {"newLine"};
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        Map<String, List<String>> map = (Map<String, List<String>>) ((Map<?, ?>) field.get(comments));
        comments.setComment(path, commentLines);
        assertEquals(1, ((Map<String, List<String>>) map).get(path).size());
    }

    @Test
    public void setCommentSingleNewLineTest() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        String path = "testPath";
        String[] commentLines = {"\n"};
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        Map<String, List<String>> map = (Map<String, List<String>>) ((Map<?, ?>) field.get(comments));
        comments.setComment(path, commentLines);
        assertEquals(0, ((Map<String, List<String>>) map).get(path).size());
    }

    @Test
    public void getAllCommentsTest() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        Map<String, List<String>> map = (Map<String, List<String>>) ((Map<?, ?>) field.get(comments));
        assertTrue(map.containsKey("testPath"));
    }

    @Test
    public void getAllCommentsEmptyMapTest() throws Exception {
        CommentsConfiguration comments = new CommentsConfiguration();
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        Map<String, List<String>> map = (Map<String, List<String>>) ((Map<?, ?>) field.get(comments));
        assertFalse(map.containsKey("testPath"));
    }

}