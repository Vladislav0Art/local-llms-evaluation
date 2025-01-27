package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_addsNewComment {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void setComment_addsNewComment() {
        // Arrange
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        String path = "path";
        String[] commentLines = {"comment 1", ""};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(2, commentsConfiguration.getAllComments().size());
    }

}