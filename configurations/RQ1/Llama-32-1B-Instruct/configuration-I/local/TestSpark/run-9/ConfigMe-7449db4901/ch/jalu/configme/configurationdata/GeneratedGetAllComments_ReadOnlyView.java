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

public class GeneratedGetAllComments_ReadOnlyView {

    private final CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private final Map<String, List<String>> comments = commentsConfiguration.comments;

    @Test
    public void getAllComments_ReadOnlyView() {
        comments.put("test", Collections.singletonList("line1"));
        assertEquals(Collections.unmodifiableMap(comments), comments.getAllComments());
    }

}