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

public class GeneratedSetComment_setsOnlyProvidedLines {

    @Test
    public void setComment_setsOnlyProvidedLines() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> providedCommentLines1 = Arrays.asList("a", "b");
        List<String> providedCommentLines2 = Collections.singletonList("");
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "pathToSet";
        commentLines(providedCommentLines1, path, configuration);
        assertEquals(providedCommentLines1, configuration.getAllComments().get(path));
    }

}