package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration

    creation() {
        assertNotNull(new CommentsConfiguration());
    }

    @Test
    public void emptyMapCommentsConfiguration

    creation() {
        assertNotNull(new CommentsConfiguration(Collections.emptyMap()));
    }

    @Test
    public void setComment_setsCommentForPath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path", "line1", "line2");
        assertEquals(2, configuration.getAllComments().get("path").size());
    }

    @Test
    public void setEmptyLine_setsEmptyLineWithoutMarker() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path", "", "line2");
        assertEquals(1, configuration.getAllComments().get("path").size());
    }

    @Test
    public void setMultipleLines_setsCorrectNumberOfLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path", "line1", "line2", "line3");
        assertEquals(3, configuration.getAllComments().get("path").size());
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path1", "line1", "line2");
        configuration.setComment("path2", "", "");
        assertEquals(Collections.unmodifiableMap(comments), configuration.getAllComments());
    }

    @Test
    public void setMultiplePaths_setsCorrectNumberOfEntries() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path1", "line1", "line2");
        configuration.setComment("path2", "", "");
        assertEquals(2, configuration.getAllComments().size());
    }

    @Test
    public void setMultipleLinesForSamePath_setsCorrectNumberOfEntries() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("path", "line1", "line2");
        assertEquals(1, configuration.getAllComments().get("path").size());
    }

    @Test
    public void setNullLines_throwsNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment("path", null, null));
    }

}