package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentNoCommentsTest {

    @Test
    public void setCommentNoCommentsTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "test";
        List<String> expectedCommentLines = Collections.emptyList();
        commentsConfig.setComment(path, "", "");
        Map<String, List<String>> commentsMap = ((CommentsConfiguration) commentsConfig).getComments();
        assertEquals(expectedCommentLines, commentsMap.get(path));
    }

}