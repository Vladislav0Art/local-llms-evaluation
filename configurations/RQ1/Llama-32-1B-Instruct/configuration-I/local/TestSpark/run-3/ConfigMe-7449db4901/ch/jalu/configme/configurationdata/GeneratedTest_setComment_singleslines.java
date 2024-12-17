package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setComment_singleslines {

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

}