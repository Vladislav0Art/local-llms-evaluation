package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("test.path", "This is a test comment");
        commentsConfiguration.setComment("other.path", "This is another test comment");

        assertEquals(2, commentsConfiguration.getAllComments().size());
        assertEquals("This is a test comment", commentsConfiguration.getAllComments().get("test.path").get(0));
        assertEquals("This is another test comment", commentsConfiguration.getAllComments().get("other.path").get(0));
    }

}