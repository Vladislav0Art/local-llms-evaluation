package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("myPath", "comment1", "comment2", "comment3");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        List<String> commentLines = comments.get("myPath");

        assertEquals(3, commentLines.size());
        assertEquals("comment1", commentLines.get(0));
        assertEquals("comment2", commentLines.get(1));
        assertEquals("comment3", commentLines.get(2));
    }

}