package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest_emptyCommentLines {

    @Test
    public void setCommentTest_emptyCommentLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testPath", "");
        List<String> testCommentLines = commentsConfiguration.getAllComments().get("testPath");
        assertNotNull(testCommentLines);
        assertEquals(1, testCommentLines.size());
        assertEquals("", testCommentLines.get(0));
    }

}