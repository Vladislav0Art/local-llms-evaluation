package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_multipleLines_setsCorrectly {

    @Test
    public void setComment_multipleLines_setsCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        Map<String, String> commentMap = new HashMap<>();
        commentMap.put("path1", "comment1");
        commentMap.put("path2", "");
        CommentsConfiguration config = new CommentsConfiguration(commentMap);
        config.setComment("path1", "", "comment2");
        assertEquals(2, config.getAllComments().size());
    }

}