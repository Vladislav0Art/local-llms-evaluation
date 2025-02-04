package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithSingleNewLineAndEmptyLinesTest {

    @Test
    public void setCommentWithSingleNewLineAndEmptyLinesTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        commentsConfiguration.setComment("path", "\n");
        assertEquals(0, commentsConfiguration.getComments().get("path").size());
    }

}