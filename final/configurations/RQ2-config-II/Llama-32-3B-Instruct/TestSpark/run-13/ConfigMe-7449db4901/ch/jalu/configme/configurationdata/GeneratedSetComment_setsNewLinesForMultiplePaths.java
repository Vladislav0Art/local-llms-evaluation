package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_setsNewLinesForMultiplePaths {

    @Test
    public void setComment_setsNewLinesForMultiplePaths() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path1 = "path1";
        String commentLine1 = "comment line 1";
        String path2 = "path2";
        String commentLine2 = "comment line 2";
        config.setComment(path1, commentLine1, commentLine2);
        assertEquals(2, ((HashMap) config.getAllComments()).size());
    }

}