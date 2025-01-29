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

public class GeneratedSetComment_Newline_NoComment2 {

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
    public void setComment_Newline_NoComment2() {
        String[] commentLines = {""};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Collections.emptyList(), comments.get(path));
    }

}