package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_emptyPath {

    @Test
    public void getAllComments_emptyPath() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        String path = "path2";
        assertEquals(Collections.emptyList(), cfg.getAllComments().get(path));
    }

}