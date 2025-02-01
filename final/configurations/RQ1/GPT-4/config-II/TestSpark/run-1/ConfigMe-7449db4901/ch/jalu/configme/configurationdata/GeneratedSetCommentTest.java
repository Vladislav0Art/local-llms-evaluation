package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path.test", "Sample Comment");
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("Sample Comment", commentsConfiguration.getAllComments().get("path.test").get(0));
    }

}