package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithNewPathAndLinesTest {

    @Test
    public void setCommentWithNewPathAndLinesTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("line3", "line4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        commentsConfiguration.setComment("path2", "line5", "line6");
        assertEquals(2, commentsConfiguration.getComments().size());
    }

}