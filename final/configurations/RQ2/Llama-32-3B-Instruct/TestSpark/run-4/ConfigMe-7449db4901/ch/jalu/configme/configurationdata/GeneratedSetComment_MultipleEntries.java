package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_MultipleEntries {

    @Test
    public void setComment_MultipleEntries() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path";
        String comment1 = "comment1";
        String comment2 = "comment2";
        configuration.setComment(path, comment1, comment2);
        assertEquals(1, configuration.getAllComments().size());
    }

}