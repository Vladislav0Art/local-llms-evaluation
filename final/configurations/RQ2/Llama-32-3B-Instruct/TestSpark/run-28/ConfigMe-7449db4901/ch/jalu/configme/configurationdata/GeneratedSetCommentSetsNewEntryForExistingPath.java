package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentSetsNewEntryForExistingPath {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void setCommentSetsNewEntryForExistingPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment11"));
        when(settingsHolder.getComments()).thenReturn(map);
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        commentsConfiguration.setComment("path2", "comment22");
        assertEquals(map, commentsConfiguration.getAllComments());
    }

}