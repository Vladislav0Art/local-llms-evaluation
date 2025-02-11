package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_addsNewLines {

    @Test
    public void setComment_addsNewLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String newLine1 = "new line 1";
        String newLine2 = "new line 2";
        config.setComment("path", newLine1, newLine2);
        assertEquals(Arrays.asList(newLine1, newLine2), config.getAllComments().get("path"));
    }

}