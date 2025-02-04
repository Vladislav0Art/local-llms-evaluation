package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        @NotNull @UnmodifiableView Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();
        assertNotNull(allComments);
        assertEquals(1, allComments.size());
    }

}