package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.utill.Map;

public class GeneratedSetCommentOverrideExistingTest {

    @Test
    public void setCommentOverrideExistingTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path", Arrays.asList("old comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        commentsConfiguration.setComment("path", "new comment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        List<String> expectedComments = new ArrayList<>();
        expectedComments.add("new comment");

        assertEquals(expectedComments, allComments.get("path"));
    }

}