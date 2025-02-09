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

public class GeneratedNewCommentsConfiguration_canBeInitializedWithMap {

    @Test
    public void newCommentsConfiguration_canBeInitializedWithMap() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> commentLines1 = Arrays.asList("a", "b");
        List<String> commentLines2 = Collections.singletonList("");
        Map<String, List<String>> mapOfCommentLines = new HashMap<>();
        mapOfCommentLines.put("key1", commentLines1);
        mapOfCommentLines.put("key2", commentLines2);
        CommentsConfiguration configuration = new CommentsConfiguration(mapOfCommentLines);
        assertEquals(commentLines1, configuration.getAllComments().get("key1"));
        assertEquals(commentLines2, configuration.getAllComments().get("key2"));
    }

}