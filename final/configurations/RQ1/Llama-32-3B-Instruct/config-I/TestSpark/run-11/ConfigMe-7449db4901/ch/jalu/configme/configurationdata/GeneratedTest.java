package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorHasNoComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

    @Test
    public void constructorInitializesCommentMapCorrectly() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

    @Test
    public void setCommentAddsSingleLineAsEmptyString() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "\n");
        assertTrue(configuration.getAllComments().containsKey("path") && configuration.getAllComments().get("path").isEmpty());
    }

    @Test
    public void setCommentAddsMultipleLinesAsCommented() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), configuration.getAllComments().get("path"));
    }

    @Test
    public void setCommentOverwritesExistingComment() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        config.setComment("path", Arrays.asList("line1"));
        assertEquals(Collections.singletonList("line2"), config.getAllComments().get("path"));
    }

    @Test
    public void setCommentSetsEmptyLineForSoleNewLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertEquals(Arrays.asList(""), config.getAllComments().get("path"));
    }

    @Test
    public void getAllCommentsIsUnmodifiableView() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotSame(comments, configuration.getAllComments());
    }
}

class ConfigMe {
    private final Map<String, List<String>> comments;

    public ConfigMe(@NotNull Map<String, List<String>> comments) {
        this.comments = comments;
    }

    @NotNull
    @UnmodifiableView
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

}