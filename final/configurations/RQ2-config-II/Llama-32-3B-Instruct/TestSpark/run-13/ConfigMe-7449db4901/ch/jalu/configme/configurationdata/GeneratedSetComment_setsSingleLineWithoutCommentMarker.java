package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_setsSingleLineWithoutCommentMarker {

    @Test
    public void setComment_setsSingleLineWithoutCommentMarker() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path = "path";
        String commentLine = "";
        config.setComment(path, commentLine);
        assertEquals(1, ((HashMap) config.getAllComments()).get(path).size());
    }

}