package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        commentsConfiguration.setComment(path, "comment1", "comment2");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey(path));
        assertEquals(Arrays.asList("comment1", "comment2"), comments.get(path));
    }

}