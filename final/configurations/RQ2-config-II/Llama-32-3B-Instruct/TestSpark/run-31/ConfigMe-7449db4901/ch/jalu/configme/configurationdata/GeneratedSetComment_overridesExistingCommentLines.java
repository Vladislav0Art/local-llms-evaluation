package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_overridesExistingCommentLines {

    @Test
    public void setComment_overridesExistingCommentLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "newLine2"));
        commentsConfig.setComment("path", "line1", "newLine2");
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

}