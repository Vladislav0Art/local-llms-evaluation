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
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_ValidPathAndCommentLines_SetsComment() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "SomePath";
        String[] commentLines = new String[]{"comment1", "comment2"};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(commentsConfiguration.getAllComments().get(path).size(), commentLines.length);
    }

    @Test
    public void setComment_InvalidPathAndCommentLines_DoesNotSetComment() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "";
        String[] commentLines = new String[]{};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(commentsConfiguration.getAllComments().get(path).size(), 0);
    }

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