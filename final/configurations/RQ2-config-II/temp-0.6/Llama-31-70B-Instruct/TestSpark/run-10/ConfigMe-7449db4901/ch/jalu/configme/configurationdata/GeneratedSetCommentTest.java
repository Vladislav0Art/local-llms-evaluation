package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testPath", "testCommentLine1", "testCommentLine2");
        List<String> testCommentLines = commentsConfiguration.getAllComments().get("testPath");
        assertNotNull(testCommentLines);
        assertEquals(2, testCommentLines.size());
        assertEquals("testCommentLine1", testCommentLines.get(0));
        assertEquals("testCommentLine2", testCommentLines.get(1));
    }

}