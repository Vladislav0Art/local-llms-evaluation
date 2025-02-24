package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestConstructorWithFilledMap {

    @Test
    public void testConstructorWithFilledMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("line1", "line2"));
        comments.put("key2", Arrays.asList("line3", "line4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assert commentsConfiguration != null;
    }

}