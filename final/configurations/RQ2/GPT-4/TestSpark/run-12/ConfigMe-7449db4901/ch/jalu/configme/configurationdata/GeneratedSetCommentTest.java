package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1", "comment2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Arrays.asList("comment1", "comment2"));

        assertEquals(expectedComments, config.getAllComments());
    }

}