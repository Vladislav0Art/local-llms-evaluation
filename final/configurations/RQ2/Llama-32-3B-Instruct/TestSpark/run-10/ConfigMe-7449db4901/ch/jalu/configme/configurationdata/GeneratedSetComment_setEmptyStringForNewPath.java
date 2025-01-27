package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setEmptyStringForNewPath {

    @Test
    public void setComment_setEmptyStringForNewPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        List<String> commentLines = Collections.singletonList("");
        config.setComment("path1", commentLines);
        assertNotNull(config.getAllComments());
        assertEquals(0, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}