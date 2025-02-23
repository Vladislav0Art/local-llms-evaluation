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
public class GeneratedSetComment_ValidPathAndCommentLines_SetsComment {

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

}