package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_multipleLines_overridesExistingComments {

    @Test
    public void setComment_multipleLines_overridesExistingComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "/test/path";
        String commentLine1 = "# Comment 1";
        String commentLine2 = "# Comment 2";
        config.setComment(path, commentLine1);
        config.setComment(path, commentLine2, commentLine3);
        Map<String, List<String>> result = config.getAllComments();
        assertEquals(2, result.size());
        assertTrue(result.get(path).contains(commentLine2));
        assertTrue(result.get(path).contains(commentLine3));
    }

}