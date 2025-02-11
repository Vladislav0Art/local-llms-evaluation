package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_setsNoNewLine {

    @Test
    public void setComment_setsNoNewLine() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        when(commentsConfiguration.getSettingsHolder()).thenReturn(SettingsHolder.create());
        commentsConfiguration.setComment("path", "line1", "line2");
        assertEquals(new HashMap<>(), commentsConfiguration.getAllComments());
    }

}