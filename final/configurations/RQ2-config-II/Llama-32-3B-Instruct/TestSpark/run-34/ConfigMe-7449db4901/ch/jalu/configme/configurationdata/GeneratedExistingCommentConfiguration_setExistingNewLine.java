package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedExistingCommentConfiguration_setExistingNewLine {

    @Test
    public void existingCommentConfiguration_setExistingNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment");
        config.setComment(path, commentLines.get(0));
        String newLine = "new1";
        config.setComment(path, newLine);
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Collections.singletonMap(path, Collections.singletonList(commentLines)), comments);
    }

}