package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.lang.reflect.Field;

public class GeneratedSetCommentTest {

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

}