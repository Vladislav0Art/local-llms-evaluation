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

public class GeneratedTestSetMultipleCommentsForSamePath {

    @Test
    public void testSetMultipleCommentsForSamePath() {
        Map<String, List<String>> comments = new HashMap<>();
        var config = new CommentsConfiguration(comments);
        config.setComment("test1", "# comment 1");
        config.setComment("test2", "# comment 2");
        assertTrue(Arrays.equals(config.getAllComments().get("test1"), Arrays.asList("# comment 1")));
    }

}