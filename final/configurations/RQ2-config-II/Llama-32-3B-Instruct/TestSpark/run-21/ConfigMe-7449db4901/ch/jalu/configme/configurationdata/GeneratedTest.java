package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructor_NoArgs

    Test() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertNotNull(commentsConfig);
    }

    @Test
    public void constructor_MultiLinesTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_NoLinesTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "";
        String[] commentLines = {};
        commentsConfig.setComment(path, commentLines);
        assertNotNull(commentsConfig);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_MultipleLinesTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String path = "";
        String[] commentLines = {"line1", "line2"};
        commentsConfig.setComment(path, commentLines);
        assertNotNull(commentsConfig);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_SingleLineTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String path = "";
        String[] commentLines = {"line"};
        commentsConfig.setComment(path, commentLines);
        assertNotNull(commentsConfig);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_SingleLineWithNoMarkerTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String path = "";
        String[] commentLines = {};
        commentsConfig.setComment(path, commentLines);
        assertNotNull(commentsConfig);
        assertEquals(0, commentsConfig.getAllComments().size());
    }

    @Test
    public void getAllComments_EmptyMap

    Test() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}