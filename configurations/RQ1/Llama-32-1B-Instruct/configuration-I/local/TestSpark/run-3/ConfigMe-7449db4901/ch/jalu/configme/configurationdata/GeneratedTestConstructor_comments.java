package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestConstructor_comments {

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

}