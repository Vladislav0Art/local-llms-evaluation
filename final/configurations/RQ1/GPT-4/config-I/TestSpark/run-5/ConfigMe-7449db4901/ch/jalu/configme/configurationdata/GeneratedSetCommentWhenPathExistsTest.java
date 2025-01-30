package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWhenPathExistsTest {

    @Test
    public void setCommentWhenPathExistsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test.path", "test comment 1", "test comment 2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(2, allComments.get("test.path").size());
        assertEquals("test comment 1", allComments.get("test.path").get(0));
        assertEquals("test comment 2", allComments.get("test.path").get(1));
    }

}