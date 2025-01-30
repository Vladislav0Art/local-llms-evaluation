package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWhenPathNotExistsTest {

    @Test
    public void setCommentWhenPathNotExistsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("new.path", "new comment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.get("new.path").size());
        assertEquals("new comment", allComments.get("new.path").get(0));
    }

}