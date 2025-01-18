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

public class GeneratedSetCommentOverridingTest {

    @Test
    public void setCommentOverridingTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1", "comment2");
        config.setComment("path", "comment3");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Collections.singletonList("comment3"));

        assertEquals(expectedComments, config.getAllComments());
    }

}