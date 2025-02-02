package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_returnsAllComments {

    @Test
    public void getAllComments_returnsAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> commentLines1 = Arrays.asList("line1");
        String path = "/path";
        config.setComment(path, "line2", "line3");
        Map<String, List<String>> map = config.getAllComments();
        assertEquals(2, ((List<String>) map.get(path)).size());
    }

}