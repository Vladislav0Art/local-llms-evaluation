package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestSetCommentWithEmptyPath {

    @Test
    public void testSetCommentWithEmptyPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "testLine1", "testLine2");
        List<String> commentLines = commentsConfiguration.getAllComments().get("");
        assertNotNull(commentLines);
        assertEquals(2, commentLines.size());
        assertEquals("testLine1", commentLines.get(0));
        assertEquals("testLine2", commentLines.get(1));
    }

}