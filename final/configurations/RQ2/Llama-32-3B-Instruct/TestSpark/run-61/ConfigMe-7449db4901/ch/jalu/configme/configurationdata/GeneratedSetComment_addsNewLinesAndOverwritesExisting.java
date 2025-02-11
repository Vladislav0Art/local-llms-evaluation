package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_addsNewLinesAndOverwritesExisting {

    @Test
    public void setComment_addsNewLinesAndOverwritesExisting() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String newLine = "new line";
        config.setComment("path", "", newLine);
        assertEquals(Arrays.asList(newLine), config.getAllComments().get("path"));
    }

}