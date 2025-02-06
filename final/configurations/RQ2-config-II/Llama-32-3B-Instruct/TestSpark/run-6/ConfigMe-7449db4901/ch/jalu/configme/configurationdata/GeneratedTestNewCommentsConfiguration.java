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

public class GeneratedTestNewCommentsConfiguration {

    @Test
    public void testNewCommentsConfiguration() {
        Map<String, List<String>> comments = new HashMap<>();
        var config = new CommentsConfiguration(comments);
        assertNotNull(config.getAllComments());
        assertEquals(0, config.getAllComments().size());
    }

}