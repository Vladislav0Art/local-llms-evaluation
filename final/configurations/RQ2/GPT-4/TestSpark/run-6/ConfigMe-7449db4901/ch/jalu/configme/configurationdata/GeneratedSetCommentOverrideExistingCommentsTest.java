package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentOverrideExistingCommentsTest {

    @Test
    public void setCommentOverrideExistingCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "comment1", "comment2");
        commentsConfiguration.setComment("path3", "comment3");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(Collections.singletonList("comment3"), allComments.get("path3"));
    }

}