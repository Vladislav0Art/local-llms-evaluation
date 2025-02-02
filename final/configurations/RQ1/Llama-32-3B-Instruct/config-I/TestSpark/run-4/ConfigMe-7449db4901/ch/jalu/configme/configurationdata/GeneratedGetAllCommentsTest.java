package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        String path1 = "path 1";
        String path2 = "path 2";
        map.put(path1, Arrays.asList("comment line 1", "comment line 2"));
        map.put(path2, Collections.singletonList("comment line 3"));
        comments.setComment(path1, "comment line 1", "comment line 2");
        comments.setComment(path2, "comment line 3");
        Map<String, @UnmodifiableView List<String>> getAllComments = comments.getAllComments();
        assertEquals(map, getAllComments);
    }

}