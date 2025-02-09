package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_overwritesExistingLinesCorrectly {

    @Test
    public void setComment_overwritesExistingLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        CommentsConfiguration expectedConfig = new CommentsConfiguration();
        expectedConfig.setComment("path1", "newLine");
        assertEquals(expectedConfig.getAllComments(), commentsConfig.getAllComments());
    }

}