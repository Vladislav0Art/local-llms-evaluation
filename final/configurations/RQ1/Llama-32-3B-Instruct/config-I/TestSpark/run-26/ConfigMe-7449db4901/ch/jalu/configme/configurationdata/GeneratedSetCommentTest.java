package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "test";
        String commentLine1 = "comment1";
        String commentLine2 = "comment2";
        List<String> expectedCommentLines = Arrays.asList(commentLine1, commentLine2);
        commentsConfig.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = ((CommentsConfiguration) commentsConfig).getComments();
        assertEquals(expectedCommentLines, commentsMap.get(path));
    }

}