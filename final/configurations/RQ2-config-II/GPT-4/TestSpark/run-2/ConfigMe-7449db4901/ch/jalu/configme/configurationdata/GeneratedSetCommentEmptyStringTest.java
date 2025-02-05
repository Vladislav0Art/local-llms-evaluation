package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.utill.Map;

public class GeneratedSetCommentEmptyStringTest {

    @Test
    public void setCommentEmptyStringTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("", "Test comment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        List<String> expectedComments = new ArrayList<>();
        expectedComments.add("Test comment");

        assertEquals(expectedComments, allComments.get(""));
    }

}