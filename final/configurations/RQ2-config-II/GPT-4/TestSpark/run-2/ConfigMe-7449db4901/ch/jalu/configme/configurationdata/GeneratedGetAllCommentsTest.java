package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.utill.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        List<String> comments = new ArrayList<>();
        comments.add("comment1");
        comments.add("comment2");
        initialComments.put("path", comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(initialComments, allComments);
    }

}