package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testConstructor_no_comments() {
        // Arrange
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.get("path")).thenReturn(Collections.emptyList());

        // Act and Assert
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNoNullPointerException();

        // Cleanup
        Mockito.verify(comments).get("path");
    }

    @Test
    public void testConstructor_comments() {
        // Arrange
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.get("path")).thenReturn(Collections.singletonList("comment1\n"));
        when(comments.get("path")).thenReturn(Collections.singletonList("comment2\n"));

        // Act and Assert
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNoNullPointerException();
    }

    @Test
    public void test_setComment_no_comments() {
        // Arrange
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.get("path")).thenReturn(Collections.emptyList());
        String path = "path";
        String...commentLines = {"line1\n", "line2\n"};

        // Act and Assert
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, commentLines);

        Mockito.verifyNoMoreInteractions(comments);
    }

    @Test
    public void test_setComment_singleslines() {
        // Arrange
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.get("path")).thenReturn(Collections.singletonList(Arrays.asList("line1\n")));
        String path = "path";
        String...commentLines = {"line1\n"};

        // Act and Assert
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, commentLines);

        Mockito.verifyNoMoreInteractions(comments);
    }

    @Test
    public void test_getAllComments_no_comments() {
        // Arrange
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.get("path")).thenReturn(Collections.emptyList());

        // Act and Assert
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentList = configuration.getAllComments().get("path");
        assertNoNullPointerException();

        // Cleanup
        Mockito.verify(comments).get("path");
    }

    @Test
    public void test_getAllComments_comments() {
        // Arrange
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        when(comments.get("path")).thenReturn(Collections.singletonList(Arrays.asList("comment1\n")));
        String path = "path";
        String...commentLines = {"line1\n", "line2\n"};

        // Act and Assert
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentList = configuration.getAllComments().get(path);
        assertNotNoNullPointerException();

        // Cleanup
        Mockito.verify(comments).get("path");
    }

}