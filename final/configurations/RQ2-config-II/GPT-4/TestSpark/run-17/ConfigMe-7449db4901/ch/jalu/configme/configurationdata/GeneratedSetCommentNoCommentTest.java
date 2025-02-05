package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentNoCommentTest {

    @Test
    public void setCommentNoCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("myPath");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        List<String> commentLines = comments.get("myPath");

        assertEquals(0, commentLines.size());
    }

}