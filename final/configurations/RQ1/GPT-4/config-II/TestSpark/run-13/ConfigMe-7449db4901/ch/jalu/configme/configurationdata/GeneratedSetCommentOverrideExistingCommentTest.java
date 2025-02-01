package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverrideExistingCommentTest {

    @Test
    public void setCommentOverrideExistingCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("test.path", "This is a test comment");
        commentsConfiguration.setComment("test.path", "This comment overrides the previous one");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("This comment overrides the previous one", commentsConfiguration.getAllComments().get("test.path").get(0));
    }

}