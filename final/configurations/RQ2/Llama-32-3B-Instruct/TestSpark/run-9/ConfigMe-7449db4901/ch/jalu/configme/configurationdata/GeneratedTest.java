package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentConfiguration_isEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

    @Test
    public void commentConfiguration_fromMap_isInitializedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(map, config.getAllComments());
    }

    @Test
    public void commentConfiguration_setComment_setsCorrectLinesForPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test", "");
        assertEquals(Collections.singletonList(""), config.getAllComments().get("test"));
    }

    @Test
    public void commentConfiguration_setMultipleLines_setsCorrectLinesForPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments().get("test"));
    }

    @Test
    public void commentConfiguration_setNoLines_setsEmptyLineForPath() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test", "");
        assertEquals(Collections.singletonList(""), config.getAllComments().get("test"));
    }

    @Test
    public void commentConfiguration_setMultiplePaths_setsLinesCorrectlyForAllPaths() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test1", Arrays.asList("line11", "line12"));
        map.put("test2", Arrays.asList("line21", "line22"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test1", "line11", "line12");
        config.setComment("test2", "");
        assertEquals(Collections.singletonMap(
                "test1", Arrays.asList("line11", "line12")
        ), config.getAllComments());
    }

}