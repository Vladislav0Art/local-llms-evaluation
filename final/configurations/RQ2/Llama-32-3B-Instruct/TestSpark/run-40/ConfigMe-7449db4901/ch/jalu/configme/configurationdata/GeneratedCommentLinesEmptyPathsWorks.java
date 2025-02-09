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

public class GeneratedCommentLinesEmptyPathsWorks {

    @Test
    public void commentLinesEmptyPathsWorks() {
        List<CommentLineMock> providedCommentLines = Arrays.asList(new CommentLineMock(), new CommentLineMock());
        String[] paths = {"a", "b"};
        Map<String, List<String>> comments = commentLines(providedCommentLines, paths);
        assertEquals(Collections.emptyList(), comments.get(paths[0]));
        assertEquals(Collections.emptyList(), comments.get(paths[1]));
    }

}