package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "config.test";
        String comment = "This is a test comment.";

        commentsConfiguration.setComment(path, comment);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();

        assertEquals(1, result.size());
        assertEquals(Collections.singletonList(comment), result.get(path));
    }

}