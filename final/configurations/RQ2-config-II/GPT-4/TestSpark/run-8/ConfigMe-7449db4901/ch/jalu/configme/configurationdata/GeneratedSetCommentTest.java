package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test.path", "test comment 1", "test comment 2");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("test.path", Arrays.asList("test comment 1", "test comment 2"));
        assertEquals(expectedComments, config.getAllComments());
    }

}