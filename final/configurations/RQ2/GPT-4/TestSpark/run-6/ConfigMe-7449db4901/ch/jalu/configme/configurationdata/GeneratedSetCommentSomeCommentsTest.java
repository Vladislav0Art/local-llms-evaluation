package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentSomeCommentsTest {

    @Test
    public void setCommentSomeCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path2", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("path2"));
    }

}