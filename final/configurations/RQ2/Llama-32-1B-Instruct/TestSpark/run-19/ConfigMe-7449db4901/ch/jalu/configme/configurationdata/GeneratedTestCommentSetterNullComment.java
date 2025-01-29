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

public class GeneratedTestCommentSetterNullComment {

    private SettingsHolder settings = new SettingsHolder();
    private Map<String, List<String>> comments = new HashMap<>();

    @BeforeEach
    public void init() {
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Collections.singletonList("comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
    }

    @Test
    public void testCommentSetterNullComment() {
        SettingsHolder settings = new SettingsHolder();
        comments.put("path", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(settings);
        String path = "path";
        Assertions.assertTrue(config.setComment(path, null));
    }

}