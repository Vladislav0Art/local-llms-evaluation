package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_setsSingleNewLine {

    @Test
    public void setComment_setsSingleNewLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Collections.singletonList(""));
        commentsConfig.setComment("path", "");
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

}