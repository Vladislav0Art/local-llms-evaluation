package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentOverrideExistingTest {

    @Test
    public void setCommentOverrideExistingTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("key1", "comment1", "comment2");
        config.setComment("key1", "newComment1", "newComment2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("key1", Arrays.asList("newComment1", "newComment2"));

        assertEquals(expectedComments, config.getAllComments());
    }

}