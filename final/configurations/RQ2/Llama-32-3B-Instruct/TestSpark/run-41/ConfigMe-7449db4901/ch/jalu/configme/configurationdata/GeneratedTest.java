package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_hasNoComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithMap_commentsAreCopiedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertEquals(1, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey("path1"));
    }

    @Test
    public void setComment_addsLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        commentsConfig.setComment("path1", "line1");
        assertEquals(1, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey("path1"));
    }

    @Test
    public void setComment_addsEmptyLineCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        commentsConfig.setComment("path1", "");
        assertEquals(0, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_overwritesExistingLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        CommentsConfiguration expectedConfig = new CommentsConfiguration();
        expectedConfig.setComment("path1", "newLine");
        assertEquals(expectedConfig.getAllComments(), commentsConfig.getAllComments());
    }

    @Test
    public void setComment_addsMultipleLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        commentsConfig.setComment("path1", "line1", "line2");
        assertEquals(2, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().get("path1").containsAll(Arrays.asList("line1", "line2")));
    }
}

class SettingsHolder {
    public static CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration();
    }

}