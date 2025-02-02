package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_WithMultipleLines_ReturnsCorrectMap {

    @Test
    public void setComment_WithMultipleLines_ReturnsCorrectMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Collections.singletonMap("", Arrays.asList("line1", "line2", "line3"));
        config.setComments(comments);
        assertEquals(comments, config.getComments());
    }

}