package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetAllComments_SingleValue {

    @Test
    public void testGetAllComments_SingleValue() {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        Mockito.when(SettingsHolder.registerComments(anyString())).thenReturn(true);

        @NotNull @UnmodifiableView Map<String, List<String>> result = configuration.getAllComments();
        assertEquals(Collections.singletonMap("path1", Collections.singletonList("line1")), result);
    }

}