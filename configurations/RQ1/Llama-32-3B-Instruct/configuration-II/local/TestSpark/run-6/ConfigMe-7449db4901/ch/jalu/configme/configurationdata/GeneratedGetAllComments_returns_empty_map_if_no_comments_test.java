package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllComments_returns_empty_map_if_no_comments_test {

    @Test
    public void getAllComments_returns_empty_map_if_no_comments_test() {
        CommentsConfiguration config = new CommentsConfiguration();

        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();

        assertTrue(allComments instanceof Map);
        assertEquals(0, allComments.size());
    }

}