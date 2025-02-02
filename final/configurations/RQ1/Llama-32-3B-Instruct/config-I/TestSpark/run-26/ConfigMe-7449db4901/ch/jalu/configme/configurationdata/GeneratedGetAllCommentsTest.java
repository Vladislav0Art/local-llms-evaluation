package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = ((CommentsConfiguration) commentsConfig).getComments();
        Map<String, List<String>> expectedCommentLines = new HashMap<>();
        // Initialize expectedCommentLines
        assertEquals(expectedCommentLines, commentsConfig.getAllComments());
    }

}