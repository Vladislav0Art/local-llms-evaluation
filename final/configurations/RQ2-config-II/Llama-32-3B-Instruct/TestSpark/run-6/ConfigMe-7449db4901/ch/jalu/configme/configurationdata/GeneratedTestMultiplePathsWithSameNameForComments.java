package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestMultiplePathsWithSameNameForComments {

    @Test
    public void testMultiplePathsWithSameNameForComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test1", Arrays.asList("# comment 1"));
        var config = new CommentsConfiguration(comments);
        config.setComment("test2", "# comment 2");
        assertTrue(Arrays.equals(config.getAllComments().get("test1"), Arrays.asList("# comment 1")));
    }

}