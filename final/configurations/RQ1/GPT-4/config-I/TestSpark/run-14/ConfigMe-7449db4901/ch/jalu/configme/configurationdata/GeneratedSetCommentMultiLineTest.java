package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentMultiLineTest {

    @Test
    public void setCommentMultiLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test-path", "test-comment1", "test-comment2", "test-comment3");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("test-comment1", "test-comment2", "test-comment3"), commentsConfiguration.getAllComments().get("test-path"));
    }

}