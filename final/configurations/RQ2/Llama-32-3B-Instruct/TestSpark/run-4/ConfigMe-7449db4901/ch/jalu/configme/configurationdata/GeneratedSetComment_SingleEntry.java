package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_SingleEntry {

    @Test
    public void setComment_SingleEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path";
        String comment = "comment";
        configuration.setComment(path, comment);
        assertEquals(1, configuration.getAllComments().size());
        assertTrue(configuration.getAllComments().containsKey(path));
    }

}