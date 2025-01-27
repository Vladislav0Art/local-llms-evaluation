package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_setsEmptyLineAsEmptyString {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void setComment_setsEmptyLineAsEmptyString() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("1", Arrays.asList(""));
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        String path = "path";
        String[] commentLines = {"", ""};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(2, commentsConfiguration.getAllComments().size());
    }

}