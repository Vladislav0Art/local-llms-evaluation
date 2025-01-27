package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_returnsEmptyMap_ifNoComments {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void getAllComments_returnsEmptyMap_ifNoComments() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();

        // Act and Assert
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

}