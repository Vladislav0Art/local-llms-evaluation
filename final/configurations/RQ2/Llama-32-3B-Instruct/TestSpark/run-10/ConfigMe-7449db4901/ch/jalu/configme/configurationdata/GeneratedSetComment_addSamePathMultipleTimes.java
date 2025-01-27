package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_addSamePathMultipleTimes {

    @Test
    public void setComment_addSamePathMultipleTimes() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        List<String> commentLines = Collections.singletonList("existingLine");
        config.setComment("path1", commentLines);
        config.setComment("path1", commentLines);
        assertNotNull(config.getAllComments());
        assertEquals(3, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}