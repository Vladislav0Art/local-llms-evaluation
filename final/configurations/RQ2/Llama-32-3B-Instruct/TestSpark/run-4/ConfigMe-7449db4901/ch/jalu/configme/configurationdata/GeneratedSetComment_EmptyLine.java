package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_EmptyLine {

    @Test
    public void setComment_EmptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path";
        String emptyLine = "";
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment(path, emptyLine);
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}