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

import org.mockito.Mockito;

public class GeneratedCommentLinesMockWorks {

    @Test
    public void commentLinesMockWorks() {
        List<CommentLineMock> providedCommentLines = Arrays.asList(new CommentLineMock(), new CommentLineMock());
        MapWrapper wrapper = new MapWrapper();
        Mockito.when(wrapper.getMap()).thenReturn(providedCommentLines);
        CommentsConfiguration configuration = new CommentsConfiguration(wrapper);
        assertEquals(Arrays.asList("a", "b"), configuration.getAllComments().get("key"));
    }

    private static List<String> commentLines(List<CommentLineMock> providedCommentLines, String... paths) {
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
        return comments;
    }

}