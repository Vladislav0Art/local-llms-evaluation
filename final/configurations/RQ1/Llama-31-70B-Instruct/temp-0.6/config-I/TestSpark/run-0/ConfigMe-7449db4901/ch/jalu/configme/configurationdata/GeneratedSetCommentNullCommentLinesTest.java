package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentNullCommentLinesTest {

    @Test
    public void setCommentNullCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        commentsConfiguration.setComment(path, null);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

}