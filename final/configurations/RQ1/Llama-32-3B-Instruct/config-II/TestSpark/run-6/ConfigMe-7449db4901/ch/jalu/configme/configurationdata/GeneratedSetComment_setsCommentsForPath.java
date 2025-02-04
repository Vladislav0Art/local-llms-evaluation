package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class GeneratedSetComment_setsCommentsForPath {

    @Test
    public void setComment_setsCommentsForPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment3");
        assertEquals(Collections.singletonList("comment3"), config.comments.get("path"));
    }

}