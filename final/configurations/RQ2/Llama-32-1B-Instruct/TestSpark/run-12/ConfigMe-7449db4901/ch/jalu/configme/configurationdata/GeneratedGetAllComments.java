package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments {

    private CommentsConfiguration commentsConfiguration;
    private Map<String, List<String>> comments;
    private String path;
    private String commentLines;
    private SettingsHolder settingsHolder;

    @BeforeEach
    public void init() {
        comments = new HashMap<>();
        comments.put("path", Arrays.asList("", "comment1", "", "comment2"));
        commentsConfiguration = new CommentsConfiguration();
        path = "path";
        settingsHolder = new SettingsHolder();
        commentLines = Arrays.asList("");
    }

    @Test
    public void getAllComments() {
        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(Collections.singletonMap("path", Arrays.asList("", "comment1", "", "comment2")), result);
    }
}

class SettingsHolder {
    public Map<String, List<String>> getComments() {
        return Collections.emptyMap();
    }

    public void setComments(Map<String, List<String>> comments) {
        this.comments = comments;
    }

}