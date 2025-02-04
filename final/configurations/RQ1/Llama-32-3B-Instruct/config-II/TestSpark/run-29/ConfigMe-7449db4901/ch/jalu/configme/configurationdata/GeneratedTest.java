package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
    }

    @Test
    public void newCommentsConfiguration_customMap() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("key", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(customComments, config.comments);
    }

    @Test
    public void setComment_setLinesForPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        config.setComment("path", lines[0], lines[1]);
        assertNotNull(config.comments.get("path"));
        assertEquals(Arrays.asList(lines), config.comments.get("path"));
    }

    @Test
    public void setComment_setEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"\n"};
        config.setComment("path", lines[0]);
        assertNotNull(config.comments.get("path"));
        assertEquals(Collections.singletonList(lines), config.comments.get("path"));
    }

    @Test
    public void setComment_setExistingPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        config.setComment("existingPath", lines[0], lines[1]);
        assertNotNull(config.comments.get("existingPath"));
        assertEquals(Arrays.asList(lines), config.comments.get("existingPath"));
    }

    @Test
    public void setComment_setMultipleLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        config.setComment("path", lines[0], lines[1]);
        assertNotNull(config.comments.get("path"));
        assertEquals(Arrays.asList(lines), config.comments.get("path"));
    }

    @Test
    public void setComment_setNullPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        assertThrows(NullPointerException.class, () -> config.setComment(null, lines));
    }

    @Test
    public void setComment_setNullLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.setComment("path", null));
    }

    @Test
    public void getAllComments_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

    @Test
    public void getAllComments_customMap() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("key", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(1, config.getAllComments().size());
        assertTrue(config.getAllComments().containsKey("key"));
    }

    @Test
    public void getAllComments_customMap_emptyPath() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("existingPath", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(0, config.getAllComments().size());
    }

    @Test
    public void getAllComments_customMap_multiplePaths() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("existingPath1", Arrays.asList("line11", "line12"));
        customComments.put("existingPath2", Arrays.asList("line21", "line22"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(0, config.getAllComments().size());
    }

    @Test
    public void getAllComments_customMap_singlePath() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("existingPath1", Arrays.asList("line11", "line12"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(1, config.getAllComments().size());
    }

}