package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_addsEmptyLineWithExistingLines {

    @Test
    public void setComment_addsEmptyLineWithExistingLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String newLine = "";
        config.setComment("path", "line1", newLine);
        assertTrue(config.getAllComments().get("path").contains(newLine));
    }

}