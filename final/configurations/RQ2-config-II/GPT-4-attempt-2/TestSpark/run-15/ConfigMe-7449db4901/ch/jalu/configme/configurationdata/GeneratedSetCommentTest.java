package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path1", "Comment1", "Comment2");
        assertEquals(Arrays.asList("Comment1", "Comment2"), commentsConfig.getAllComments().get("path1"));
    }

}