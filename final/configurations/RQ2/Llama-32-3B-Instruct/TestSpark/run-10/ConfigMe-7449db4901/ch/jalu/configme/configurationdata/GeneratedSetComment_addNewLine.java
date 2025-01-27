package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_addNewLine {

    @Test
    public void setComment_addNewLine() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> commentLines = Collections.singletonList("");
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path1", commentLines);
        assertNotNull(config.getAllComments());
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}