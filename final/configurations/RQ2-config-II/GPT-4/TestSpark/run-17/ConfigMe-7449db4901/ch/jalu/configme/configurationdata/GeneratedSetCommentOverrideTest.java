package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("myPath", "comment1", "comment2");
        commentsConfiguration.setComment("myPath", "comment3");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        List<String> commentLines = comments.get("myPath");

        assertEquals(1, commentLines.size());
        assertEquals("comment3", commentLines.get(0));
    }

}