package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsLinesForPath {

    @Test
    public void setComment_setsLinesForPath() {
        String path = "test-path";
        List<String> lines = Arrays.asList("line1", "line2");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, lines);
        assertNotNull(commentsConfiguration.getComments().get(path));
        assertEquals(lines, commentsConfiguration.getComments().get(path));
    }

}