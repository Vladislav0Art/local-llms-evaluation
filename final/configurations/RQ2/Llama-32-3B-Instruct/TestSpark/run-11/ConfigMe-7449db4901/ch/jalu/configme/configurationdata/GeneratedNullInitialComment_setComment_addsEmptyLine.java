package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNullInitialComment_setComment_addsEmptyLine {

    @Test
    public void nullInitialComment_setComment_addsEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "/test/path";
        String commentLine1 = "# Comment 1";
        String commentLine2 = "";
        config.setComment(path, commentLine1, null);
        Map<String, List<String>> result = config.getAllComments();
        assertEquals(2, result.size());
        assertTrue(result.get(path).contains(commentLine1));
        assertTrue(result.get(path).contains(""));
    }

}