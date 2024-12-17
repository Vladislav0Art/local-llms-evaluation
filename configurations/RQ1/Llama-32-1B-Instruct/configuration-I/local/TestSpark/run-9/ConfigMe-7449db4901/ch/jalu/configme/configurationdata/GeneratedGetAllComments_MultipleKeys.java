package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class GeneratedGetAllComments_MultipleKeys {

    private final CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private final Map<String, List<String>> comments = commentsConfiguration.comments;

    @Test
    public void getAllComments_MultipleKeys() {
        comments.put("key1", Collections.singletonList("line1"));
        comments.put("key2", Arrays.asList("line2", "line3"));
        assertEquals(Collections.unmodifiableMap(Map.of("key1", Collections.unmodifiableList(Arrays.asList("line1")), "key2", Map.of())), comments.getAllComments());
    }

}