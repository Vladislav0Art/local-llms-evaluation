package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverwritesPreviousEntry {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void setCommentOverwritesPreviousEntry() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment11"));
        when(settingsHolder.getComments()).thenReturn(map);
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment12");
        assertEquals(Arrays.asList("comment12"), commentsConfiguration.getAllComments().get("path1"));
    }

}