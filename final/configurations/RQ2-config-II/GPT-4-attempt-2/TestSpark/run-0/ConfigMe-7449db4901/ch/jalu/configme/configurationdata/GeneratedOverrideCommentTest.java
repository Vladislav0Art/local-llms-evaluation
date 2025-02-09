package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOverrideCommentTest {

    @Test
    public void overrideCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        commentsConfiguration.setComment("path", "line3", "line4");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertEquals(2, commentLines.size());
        assertEquals("line3", commentLines.get(0));
        assertEquals("line4", commentLines.get(1));
    }

}