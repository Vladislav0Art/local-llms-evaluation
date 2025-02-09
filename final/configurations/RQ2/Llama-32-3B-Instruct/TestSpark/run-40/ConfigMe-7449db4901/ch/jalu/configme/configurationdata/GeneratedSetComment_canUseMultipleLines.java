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

public class GeneratedSetComment_canUseMultipleLines {

    @Test
    public void setComment_canUseMultipleLines() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> providedCommentLines1 = Arrays.asList("a", "b");
        List<String> commentLine1 = Arrays.asList("1");
        List<String> commentLine2 = Arrays.asList("");
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        commentLines(providedCommentLines1, Arrays.asList(commentLine1, commentLine2), configuration);
        assertEquals(Arrays.asList(commentLine1, commentLine2), configuration.getAllComments().get("pathToSet"));
    }

}