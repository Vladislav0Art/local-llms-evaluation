package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetAllComments_returnsUnmodifiableView {

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "line2"));
        assertEquals(expectedMap, commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isUnmodifiable());
    }

}