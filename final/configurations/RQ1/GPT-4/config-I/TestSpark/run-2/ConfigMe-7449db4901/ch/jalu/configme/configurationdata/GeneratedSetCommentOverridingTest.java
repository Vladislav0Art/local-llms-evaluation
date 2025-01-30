package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverridingTest {

    @Test
    public void setCommentOverridingTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "Comment1", "Comment2");
        configuration.setComment("path1", "Comment3", "Comment4");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("Comment3", "Comment4"));

        assertEquals(expectedComments, configuration.getAllComments());
    }

}