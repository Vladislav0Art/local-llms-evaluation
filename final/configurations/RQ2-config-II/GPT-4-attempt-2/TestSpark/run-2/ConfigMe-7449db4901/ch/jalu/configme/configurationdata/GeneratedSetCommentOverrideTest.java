package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "commentLine1", "commentLine2");
        config.setComment("path1", "commentLine3");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.get("path1").size());
        assertTrue(comments.get("path1").contains("commentLine3"));
    }

}