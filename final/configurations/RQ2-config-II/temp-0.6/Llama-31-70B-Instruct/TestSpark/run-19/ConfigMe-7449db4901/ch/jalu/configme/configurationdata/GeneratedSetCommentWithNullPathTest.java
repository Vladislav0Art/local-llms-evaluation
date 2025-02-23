package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeneratedSetCommentWithNullPathTest {

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "line1");
        List<String> commentLines = commentsConfiguration.getAllComments().get(null);
        assertNotNull(commentLines);
        assertEquals(Arrays.asList("line1"), commentLines);
    }

}