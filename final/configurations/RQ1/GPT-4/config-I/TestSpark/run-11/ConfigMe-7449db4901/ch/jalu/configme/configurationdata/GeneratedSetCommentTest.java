package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path1";
        String comment1 = "comment1";
        String comment2 = "comment2";
        commentsConfiguration.setComment(path, comment1, comment2);

        List<String> expectedComments = Arrays.asList(comment1, comment2);
        assertEquals("Comments for the path should match the input comments", expectedComments, commentsConfiguration.getAllComments().get(path));
    }

}