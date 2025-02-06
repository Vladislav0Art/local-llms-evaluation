package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_overwritesExistingEntry {

    @Test
    public void setComment_overwritesExistingEntry() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("path1", "newComment");
        assertEquals(1, config.getAllComments().size());
    }

}