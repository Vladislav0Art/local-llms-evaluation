package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedExistingCommentConfiguration_setNewLines {

    @Test
    public void existingCommentConfiguration_setNewLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment");
        config.setComment(path, commentLines.get(0));
        List<String> newLines = Arrays.asList("new1", "new2");
        config.setComment(path, newLines);
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Collections.singletonMap(path, Collections.singletonList(newLines)), comments);
    }

}