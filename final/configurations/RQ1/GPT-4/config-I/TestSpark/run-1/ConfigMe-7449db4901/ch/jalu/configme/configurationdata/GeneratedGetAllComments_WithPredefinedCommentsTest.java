package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetAllComments_WithPredefinedCommentsTest {

    @Test
    public void getAllComments_WithPredefinedCommentsTest() {
        Map<String, List<String>> predefinedComments = new HashMap<>();
        predefinedComments.put("path1", Collections.singletonList("comment1"));
        predefinedComments.put("path2", Collections.singletonList("comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(predefinedComments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(predefinedComments, allComments);
    }

}