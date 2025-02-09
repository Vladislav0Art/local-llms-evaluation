package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_hasEmptyComments {

    @Test
    public void newCommentsConfiguration_hasEmptyComments() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().isEmpty());
    }

}