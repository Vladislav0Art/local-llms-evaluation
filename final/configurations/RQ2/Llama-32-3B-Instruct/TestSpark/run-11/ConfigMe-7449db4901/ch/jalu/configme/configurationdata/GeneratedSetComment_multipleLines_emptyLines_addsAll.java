package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_multipleLines_emptyLines_addsAll {

    @Test
    public void setComment_multipleLines_emptyLines_addsAll() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "/test/path";
        String commentLine1 = "# Comment 1";
        String commentLine2 = "";
        String commentLine3 = "";
        config.setComment(path, commentLine1, null, "");
        Map<String, List<String>> result = config.getAllComments();
        assertEquals(3, result.size());
        assertTrue(result.get(path).contains(commentLine1));
        assertTrue(result.get(path).contains(""));
        assertTrue(result.get(path).contains(""));
    }

}