package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "test comment 3", "test comment 4");

        assertTrue(commentsConfiguration.getAllComments().containsKey("path3"));
        assertTrue(commentsConfiguration.getAllComments().get("path3").contains("test comment 3"));
        assertTrue(commentsConfiguration.getAllComments().get("path3").contains("test comment 4"));
    }

}