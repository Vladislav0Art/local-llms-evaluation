package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        String path = "config.path";
        String[] initialCommentLines = {"This is a comment", "This is another comment"};
        String[] overwrittenCommentLines = {"This is a new comment"};

        commentsConfiguration.setComment(path, initialCommentLines);
        commentsConfiguration.setComment(path, overwrittenCommentLines);

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path, Arrays.asList(overwrittenCommentLines));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}