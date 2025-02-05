package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("key1", "comment1");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("key1", Collections.singletonList("comment1"));

        assertEquals(expectedComments, config.getAllComments());
    }

}