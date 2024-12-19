package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        // Test constructor with empty map
        CommentsConfiguration comments = new CommentsConfiguration();
        Assertions.assertEquals(Collections.emptyMap(), comments.comments);

        // Test constructor with non-empty map
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        comments = builder.buildComments(new HashMap<>());
        Assertions.assertEquals(builder.getComments(), comments.comments);
    }

}