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

public class GeneratedGetComment_InvalidPath {

    private final CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private final Map<String, List<String>> comments = commentsConfiguration.comments;

    @Test
    public void getComment_InvalidPath() {
        comments.put("test", Collections.singletonList("line1"));
        try {
            comments.get("non-existent-path");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}