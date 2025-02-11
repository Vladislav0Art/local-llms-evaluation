package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_addsEmptyLine {

    @Test
    public void setComment_addsEmptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String newLine = "";
        config.setComment("path", "", newLine);
        assertTrue(config.getAllComments().get("path").contains(newLine));
    }

}