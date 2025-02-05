package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.utill.Map;

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("path", "line1", "line2", "line3");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        List<String> expectedComments = new ArrayList<>();
        expectedComments.add("line1");
        expectedComments.add("line2");
        expectedComments.add("line3");

        assertEquals(expectedComments, allComments.get("path"));
    }

}