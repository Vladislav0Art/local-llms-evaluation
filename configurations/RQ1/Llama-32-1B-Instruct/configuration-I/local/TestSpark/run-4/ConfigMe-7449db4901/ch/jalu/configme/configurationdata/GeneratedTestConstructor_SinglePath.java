package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConstructor_SinglePath {

    @Test
    public void testConstructor_SinglePath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1"));

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Mockito.when(SettingsHolder.registerComments(anyString())).thenReturn(true);

        assertNotEquals(Collections.emptyList(), configuration.getAllComments().values());
    }

}