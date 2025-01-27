package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("1", Arrays.asList("comment 1"));
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        commentsConfiguration.setComments(map);

        assertNotNull(commentsConfiguration.getAllComments());
        assertTrue(commentsConfiguration.getAllComments().isUnmodifiable());
    }

}