package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentWithNewLineTest {

    @Test
    public void setCommentWithNewLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        String[] comments = {"comment1", "comment2", "\n"};
        commentsConfiguration.setComment(path, comments);
        assertEquals(commentsConfiguration.getAllComments().get(path), Arrays.asList(comments));
    }

}