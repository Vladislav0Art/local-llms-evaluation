package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2", "line3");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertEquals(3, commentLines.size());
        assertEquals("line1", commentLines.get(0));
        assertEquals("line2", commentLines.get(1));
        assertEquals("line3", commentLines.get(2));
    }

}