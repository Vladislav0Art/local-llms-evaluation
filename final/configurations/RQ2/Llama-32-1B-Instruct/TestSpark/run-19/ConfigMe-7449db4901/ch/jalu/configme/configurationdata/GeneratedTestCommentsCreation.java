package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfigurationException;
import ch.jalu.configme.settings.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestCommentsCreation {

    private SettingsHolder settings = new SettingsHolder();
    private Map<String, List<String>> comments = new HashMap<>();

    @BeforeEach
    public void init() {
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Collections.singletonList("comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
    }

    @Test
    public void testCommentsCreation() {
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.getComments().isEmpty());
        String path1 = "path1";
        String path2 = "path2";
        config.setComment(path1, Arrays.asList("comment1"));
        config.setComment(path2, Collections.singletonList("comment2"));
        Assertions.assertFalse(config.getComments().isEmpty());
    }

}