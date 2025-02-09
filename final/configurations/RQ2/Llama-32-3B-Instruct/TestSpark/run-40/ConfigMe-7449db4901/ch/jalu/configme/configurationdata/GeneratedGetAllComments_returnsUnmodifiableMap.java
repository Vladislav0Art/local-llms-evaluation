package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().isUnmodifiable());
    }

    private static void commentLines(List<String> providedCommentLines, String... paths) {
        Map<String, List<String>> comments = new HashMap<>();
        for (String path : paths) {
            if (!path.isEmpty()) {
                if (comments.containsKey(path)) {
                    comments.get(path).addAll(providedCommentLines);
                } else {
                    comments.put(path, providedCommentLines);
                }
            } else {
                comments.putIfAbsent(path, Collections.emptyList());
            }
        }
    }

}