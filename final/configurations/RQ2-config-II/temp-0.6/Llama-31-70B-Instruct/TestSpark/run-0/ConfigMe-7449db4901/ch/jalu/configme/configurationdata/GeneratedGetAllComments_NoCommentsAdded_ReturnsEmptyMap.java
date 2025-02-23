package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_NoCommentsAdded_ReturnsEmptyMap {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void getAllComments_NoCommentsAdded_ReturnsEmptyMap() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // Act
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        // Assert
        assertEquals(comments.size(), 0);
    }

}