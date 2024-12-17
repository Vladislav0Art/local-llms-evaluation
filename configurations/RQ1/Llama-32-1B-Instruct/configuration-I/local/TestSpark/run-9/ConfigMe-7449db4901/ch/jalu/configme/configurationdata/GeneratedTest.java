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

public class GeneratedTest {

    private final CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private final Map<String, List<String>> comments = commentsConfiguration.comments;

    @Test
    public void setComment_SingleLine() {
        comments.set("test", Collections.singletonList("line1"));
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1")), comments.get("test"));
    }

    @Test
    public void setComment_SingleLine_MultipleLines() {
        comments.set("test", Arrays.asList("line1", "line2"));
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1", "line2")), comments.get("test"));
    }

    @Test
    public void getAllComments_ReadOnlyView() {
        comments.put("test", Collections.singletonList("line1"));
        assertEquals(Collections.unmodifiableMap(comments), comments.getAllComments());
    }

    @Test
    public void getAllComments_MultipleKeys() {
        comments.put("key1", Collections.singletonList("line1"));
        comments.put("key2", Arrays.asList("line2", "line3"));
        assertEquals(Collections.unmodifiableMap(Map.of("key1", Collections.unmodifiableList(Arrays.asList("line1")), "key2", Map.of())), comments.getAllComments());
    }

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

    @Test
    public void getComment_SingleLine_ExistingComment() {
        comments.set("test", Arrays.asList("line1"));
        comments.get("test").add(0, "new-line");
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1")), comments.get("test"));
    }

    @Test
    public void setComment_MultipleLines_OverrideExistingComment() {
        comments.set("test", Arrays.asList("line1", "line2"));
        comments.get("test").add(0, "new-line");
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1", "new-line")), comments.get("test"));
    }

    @Test
    public void setComment_MultipleLines_NewLineNoOverride() {
        comments.set("test", Arrays.asList("line1", new String[]{"line2"}));
        assertEquals(Collections.unmodifiableList(Arrays.asList("line1")), comments.get("test"));
    }

}