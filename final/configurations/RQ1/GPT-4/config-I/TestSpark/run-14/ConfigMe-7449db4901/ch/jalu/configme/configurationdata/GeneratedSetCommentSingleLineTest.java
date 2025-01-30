package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test-path", "test-comment");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("test-comment"), commentsConfiguration.getAllComments().get("test-path"));
    }

}