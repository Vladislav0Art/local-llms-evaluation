package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_getAllComments_comments {

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