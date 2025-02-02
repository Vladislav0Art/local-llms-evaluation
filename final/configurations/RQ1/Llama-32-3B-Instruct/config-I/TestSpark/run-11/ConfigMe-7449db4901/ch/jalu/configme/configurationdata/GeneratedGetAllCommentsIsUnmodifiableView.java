package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsIsUnmodifiableView {

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