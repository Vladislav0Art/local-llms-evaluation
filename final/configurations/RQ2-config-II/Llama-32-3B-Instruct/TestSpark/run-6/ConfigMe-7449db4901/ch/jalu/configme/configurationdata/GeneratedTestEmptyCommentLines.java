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

public class GeneratedTestEmptyCommentLines {

    @Test
    public void testEmptyCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        var config = new CommentsConfiguration(comments);
        config.setComment("test", "");
        assertTrue(Arrays.equals(config.getAllComments().get("test"), Collections.emptyList()));
    }

}