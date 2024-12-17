package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetAllComments_SinglePathNoComment {

    @Test
    public void testGetAllComments_SinglePathNoComment() {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        Mockito.when(SettingsHolder.registerComments(anyString())).thenReturn(true);

        Mockito.verifyAll(() -> {
            @NotNull @UnmodifiableView Map<String, @UnmodifiableView List<String>> result = configuration.getAllComments();
            MockitoassertThat(result.get("path1"), @NotNull @UnmodifiableView List < String > ()::new);
        });
    }

}