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

public class GeneratedTestCommentSetter {

    private SettingsHolder settings = new SettingsHolder();
    private Map<String, List<String>> comments = new HashMap<>();

    @BeforeEach
    public void init() {
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Collections.singletonList("comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
    }

    @Test
    public void testCommentSetter() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        assertions.assertTrue(config.setComment(path, Arrays.asList("newline1\nnewline2")));
        Assertions.assertEquals(Arrays.asList(new String[]{"newline1\nnewline2"}), config.getAllComments().get(path));
    }

}