package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetAllComments_SinglePath {

    @Test
    public void testGetAllComments_SinglePath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Mockito.when(SettingsHolder.registerComments(anyString())).thenReturn(true);

        @NotNull @UnmodifiableView Map<String, @UnmodifiableView List<String>> result = configuration.getAllComments();
        assertEquals(Collections.singletonMap("path1", Collections.singletonList("line1")), result);
    }

}