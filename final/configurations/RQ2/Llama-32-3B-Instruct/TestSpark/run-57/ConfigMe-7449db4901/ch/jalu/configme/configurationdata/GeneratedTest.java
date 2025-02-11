package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
    }

    @Test
    public void commentsConfigurationFromMap_isCorrectlyCreated() {
        Map<String, List<String>> map = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(new HashMap<>() {{
            put("path", Arrays.asList("line1", "line2"));
        }}, commentsConfiguration.getAllComments());
    }

    @Test
    public void setComment_setsCorrectLines() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        when(commentsConfiguration.getSettingsHolder()).thenReturn(SettingsHolder.create());
        commentsConfiguration.setComment("path", "", "line1", "line2");
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
        verify(commentsConfiguration.getSettingsHolder()).addLines("path", Arrays.asList("", "line1", "line2"));
    }

    @Test
    public void setComment_setsMultipleCorrectLines() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        when(commentsConfiguration.getSettingsHolder()).thenReturn(SettingsHolder.create());
        commentsConfiguration.setComment("path", "", "line1", "line2", "");
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
        verify(commentsConfiguration.getSettingsHolder()).addLines("path", Arrays.asList("", "line1", "line2", ""));
    }

    @Test
    public void setComment_setsNoNewLine() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        when(commentsConfiguration.getSettingsHolder()).thenReturn(SettingsHolder.create());
        commentsConfiguration.setComment("path", "line1", "line2");
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllComments_returnsCorrectMap() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        when(commentsConfiguration.getSettingsHolder()).thenReturn(SettingsHolder.create());
        commentsConfiguration.setComment("path", "", "line1", "line2");
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
    }

}