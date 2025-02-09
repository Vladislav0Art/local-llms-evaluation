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

public class GeneratedSetComment_overwritesExistingValues {

    @Test
    public void setComment_overwritesExistingValues() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> providedCommentLines1 = Arrays.asList("a", "b");
        List<String> providedCommentLines2 = Arrays.asList("c", "d");
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        commentLines(providedCommentLines1, "pathToSet", configuration);
        commentLines(providedCommentLines2, "pathToSet", configuration);
        assertEquals(providedCommentLines2, configuration.getAllComments().get("pathToSet"));
    }

}