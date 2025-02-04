package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithExistingPathAndLinesTest {

    @Test
    public void setCommentWithExistingPathAndLinesTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("line3", "line4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        commentsConfiguration.setComment("path1", "line5", "line6");
        assertEquals(2, commentsConfiguration.getComments().get("path1").size());
    }

}