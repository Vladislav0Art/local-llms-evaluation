package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        // Test with single comment line
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("/path", "some comment");
        Collections.unmodifiableList(Collections.singletonList("some other comment"));
        Assertions.assertArrayEquals(Arrays.asList("some comment"), configuration.comments.get("/path"));

        // Test with multiple comment lines
        configuration = new CommentsConfiguration(new HashMap<>());
        configuration.setComment("/path", Arrays.asList("line 1", "line 2"));
        Assertions.assertArrayEquals(Arrays.asList("line 1", "line 2"), configuration.comments.get("/path"));

        // Test with empty string for single line
        configuration = new CommentsConfiguration();
        configuration.setComment("/path", "");
        Collections.unmodifiableList(Collections.singletonList(""));
        Assertions.assertArrayEquals(Collections.emptyList(), configuration.comments.get("/path"));
    }

}