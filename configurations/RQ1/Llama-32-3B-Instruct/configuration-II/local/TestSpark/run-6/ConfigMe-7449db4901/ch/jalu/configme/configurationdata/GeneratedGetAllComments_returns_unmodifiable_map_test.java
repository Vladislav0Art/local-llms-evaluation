package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllComments_returns_unmodifiable_map_test {

    @Test
    public void getAllComments_returns_unmodifiable_map_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path1 = "path1";
        String commentLine1 = "comment1";

        config.setComment(path1, commentLine1);

        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();

        assertTrue(allComments instanceof Map);
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path1));
        assertEquals(Arrays.asList(commentLine1), allComments.get(path1));
    }

}