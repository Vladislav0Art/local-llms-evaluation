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

public class GeneratedSetComment_MultipleLines_NewLineNoOverride {

    private final CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private final Map<String, List<String>> comments = commentsConfiguration.comments;

    @Test
    public void setComment_MultipleLines_NewLineNoOverride() {
        comments.set("test", Arrays.asList("line1", new String[]{"line2"}));
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1")), comments.get("test"));
    }

}