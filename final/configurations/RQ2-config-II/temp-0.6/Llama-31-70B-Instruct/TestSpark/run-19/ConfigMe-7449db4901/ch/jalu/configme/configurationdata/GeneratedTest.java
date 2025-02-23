package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertNotNull(commentLines);
        assertEquals(Arrays.asList("line1", "line2"), commentLines);
    }

    @Test
    public void setCommentWithNewlineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "\n", "line1");
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertNotNull(commentLines);
        assertEquals(Arrays.asList("\n", "line1"), commentLines);
    }

    @Test
    public void setCommentWithEmptyPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "line1");
        List<String> commentLines = commentsConfiguration.getAllComments().get("");
        assertNotNull(commentLines);
        assertEquals(Arrays.asList("line1"), commentLines);
    }

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "line1");
        List<String> commentLines = commentsConfiguration.getAllComments().get(null);
        assertNotNull(commentLines);
        assertEquals(Arrays.asList("line1"), commentLines);
    }

}