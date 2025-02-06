package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_emptyLine {

    @Test
    public void setComment_emptyLine() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1"));
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        String path = "path1";
        String[] commentLines = {""};
        cfg.setComment(path, commentLines);
        assertEquals(0, cfg.getAllComments().get(path).size());
    }

}