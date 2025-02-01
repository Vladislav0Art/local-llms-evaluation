package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertArrayEquals("getAllComments output is different from expected",
                comments.entrySet().toArray(), allComments.entrySet().toArray());
    }

}