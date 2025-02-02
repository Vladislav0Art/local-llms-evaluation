package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetComments_SingleLine_ReturnsCorrectList {

    @Test
    public void getComments_SingleLine_ReturnsCorrectList() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Collections.singletonMap("", Arrays.asList("line1"));
        config.setComments(comments);
        assertEquals(Collections.singletonList("line1"), config.getComments().get(""));
    }

}