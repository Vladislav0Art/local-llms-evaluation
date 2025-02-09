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

public class GeneratedCommentLinesOnePathWorks {

    @Test
    public void commentLinesOnePathWorks() {
        List<CommentLineMock> providedCommentLines = Arrays.asList(new CommentLineMock());
        String path = "a";
        Map<String, List<String>> comments = commentLines(providedCommentLines, path);
        assertEquals(Collections.singletonList("a"), comments.get(path));
    }

}