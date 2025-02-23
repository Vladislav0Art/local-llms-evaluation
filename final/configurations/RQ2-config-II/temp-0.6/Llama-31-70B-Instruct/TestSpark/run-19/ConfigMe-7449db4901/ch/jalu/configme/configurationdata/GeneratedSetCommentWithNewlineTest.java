package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeneratedSetCommentWithNewlineTest {

    @Test
    public void setCommentWithNewlineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "\n", "line1");
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertNotNull(commentLines);
        assertEquals(Arrays.asList("\n", "line1"), commentLines);
    }

}