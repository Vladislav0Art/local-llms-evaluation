package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String comment1 = "comment1";
        String comment2 = "comment2";
        commentsConfiguration.setComment(path, comment1, comment2);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertEquals(Arrays.asList(comment1, comment2), comments.get(path));
    }

}