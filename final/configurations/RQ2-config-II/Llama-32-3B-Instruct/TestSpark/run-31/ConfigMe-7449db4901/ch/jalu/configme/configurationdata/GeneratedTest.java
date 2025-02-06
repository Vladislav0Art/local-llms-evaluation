package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_fromHashMap_isNotEmpty() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig.getAllComments());
        assertFalse(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void setComment_setsCommentLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "line2"));
        commentsConfig.setComment("path", "line1", "line2");
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_overridesExistingCommentLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "newLine2"));
        commentsConfig.setComment("path", "line1", "newLine2");
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_setsSingleNewLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Collections.singletonList(""));
        commentsConfig.setComment("path", "");
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_throwsNullPointerException_ifPathIsNull() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(null, "line1"));
    }

    @Test
    public void setComment_throwsNullPointerException_ifCommentLinesIsNull() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "line2"));
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment("path", null));
    }

    @Test
    public void setComment_throwsNullPointerException_ifAnyCommentLineIsNull() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "line2"));
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment("path", null, "line2"));
    }

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Arrays.asList("line1", "line2"));
        assertEquals(expectedMap, commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isUnmodifiable());
    }

}