package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentNullCommentsTest {

    @Test
    public void setCommentNullCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(Collections.emptyList(), allComments.get("path1"));
    }

}