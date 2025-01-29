package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationException;
import iomockito.Mockito;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private SettingsHolder settingsHolder = Mockito.mock(SettingsHolder.class);
    private Map<String, List<String>> comments = new HashMap<>();

    @Test
    public void setComment_SingleLine

    commentLines() {
        // Arrange
        String path = "path";
        String...commentLines = {"line1", ""};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(commentLines.length, comments.get(path).size());
    }

    @Test
    public void setComment_EvenNumberOfLines() {
        // Arrange
        String path = "path";
        String...commentLines = {"line1", "", "line2"};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(commentLines.length, comments.get(path).size());
    }

    @Test
    public void setComment_MultipleLine

    commentLines() {
        // Arrange
        String path = "path";
        String...commentLines = {"line1", "", ""};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(commentLines.length, comments.get(path).size());
    }

    @Test
    public void setCommentNoComment() {
        // Arrange
        String path = "path";
        String...commentLines = {};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        assertEquals(0, comments.get(path).size());
    }

    @Test
    public void getAllComments_MutableMap() {
        // Arrange
        comments = new HashMap<>();
        comments.put("path", Collections.singletonList("line1"));

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(1, comments.size());
        assertEquals(1, comments.get("path").size());
    }

    @Test
    public void getAllCommentsNoComments() {
        // Arrange
        settingsHolder = Mockito.mock(SettingsHolder.class);
        commentsConfiguration = new CommentsConfiguration();
        Mockito.when(settingsHolder.getAllComments()).thenReturn(new HashMap<>());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(0, settingsHolder.getAllComments().size());
    }

    @Test
    public void getAllCommentsEmptyMap() {
        // Arrange
        settingsHolder = Mockito.mock(SettingsHolder.class);
        comments = new HashMap<>();
        Mockito.when(settingsHolder.getAllComments()).thenReturn(Collections.emptyList());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(0, settingsHolder.getAllComments().size());
    }

    @Test
    public void getAllCommentsNoComments() {
        // Arrange
        settingsHolder = Mockito.mock(SettingsHolder.class);
        comments = Collections.emptyList();

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");

        // Assert
        assertEquals(0, settingsHolder.getAllComments().size());
    }

    @Test
    public void getCommentNoComment() {
        // Arrange
        String path = "path";
        Mockito.when(settingsHolder.getAllComments()).thenReturn(Collections.emptyList());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, "");

        // Assert
        assertEquals("", configuration.getALLComments().get(path));
    }

    @Test
    public void getCommentNoCommentMap() {
        // Arrange
        String path = "path";
        Mockito.when(settingsHolder.getAllComments()).thenReturn(Collections.emptyMap());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, "");

        // Assert
        assertEquals(0, configuration.getAllComments().size());
    }

    @Test
    public void getCommentNoCommentList() {
        // Arrange
        String path = "path";
        Mockito.when(settingsHolder.getAllComments()).thenReturn(Collections.emptyList());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, "comment");

        // Assert
        assertEquals(1, configuration.getAllComments().size());
    }

    @Test
    public void getCommentNoCommentMapList() {
        // Arrange
        String path = "path";
        Mockito.when(settingsHolder.getAllComments()).thenReturn(Collections.emptyList());

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, "comment");

        // Assert
        assertEquals(0, configuration.getAllComments().size());
    }

    @Test
    public void getAllCommentsNoMap() {
        // Arrange
        String path = "path";

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration();

        // Assert
        assertEquals(0, configuration.getAllComments().size());
    }

}