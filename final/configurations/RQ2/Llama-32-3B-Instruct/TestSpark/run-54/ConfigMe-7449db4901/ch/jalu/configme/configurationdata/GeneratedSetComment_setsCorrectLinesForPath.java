package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_setsCorrectLinesForPath {

    @Test
    public void setComment_setsCorrectLinesForPath() {
        // Given:
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path1";
        String line1 = "line1";
        String line2 = "line2";

        // When:
        configuration.setComment(path, line1, line2);

        // Then:
        assertEquals(2, comments.get(path).size());
        assertTrue(comments.get(path).contains(line1));
        assertTrue(comments.get(path).contains(line2));
    }

}