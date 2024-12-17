package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConstructor_MultiplePaths {

    @Test
    public void testConstructor_MultiplePaths() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Mockito.when(SettingsHolder.registerComments(anyString())).thenReturn(true);

        assertNotEquals(Collections.emptyList(), configuration.getAllComments().values());
    }

}