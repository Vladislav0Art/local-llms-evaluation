package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        // Test with non-empty map and empty string for single line
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration comments = builder.buildComments(new HashMap<>());
        Assertions.assertEquals(builder.getComments(), comments.getAllComments());

        // Test with non-empty map and multiple comment lines
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        configuration.setComment("/path", Arrays.asList("line 1", "line 2"));
        Assertions.assertEquals(builder.getComments(), configuration.getAllComments());
    }

}