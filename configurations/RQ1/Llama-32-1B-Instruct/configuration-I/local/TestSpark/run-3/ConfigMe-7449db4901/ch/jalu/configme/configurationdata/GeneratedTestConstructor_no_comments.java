package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestConstructor_no_comments {

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

}