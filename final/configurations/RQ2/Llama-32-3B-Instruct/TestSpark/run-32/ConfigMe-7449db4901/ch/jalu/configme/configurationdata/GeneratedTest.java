package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_emptyMap_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertNotNull(commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_singleComment_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void newCommentsConfiguration_multipleComment_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(2, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_singleComment_line_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {"comment1"};
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_singleEmptyLine_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {""};
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void setComment_multipleComment_lines_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {"comment1", "comment2"};
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_singleComment_line_multiple_times_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {"comment1"};
        commentsConfig.setComment("path", commentLines[0]);
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(1, commentsConfig.getAllComments().size());
    }

    @Test
    public void setComment_singleEmptyLine_multiple_times_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {""};
        commentsConfig.setComment("path", commentLines[0]);
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void setComment_multipleEmptyLine_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {"", ""};
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}