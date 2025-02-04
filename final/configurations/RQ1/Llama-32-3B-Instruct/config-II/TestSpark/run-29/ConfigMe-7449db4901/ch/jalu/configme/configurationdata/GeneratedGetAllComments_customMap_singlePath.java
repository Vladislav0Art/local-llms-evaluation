package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_customMap_singlePath {

    @Test
    public void getAllComments_customMap_singlePath() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("existingPath1", Arrays.asList("line11", "line12"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(1, config.getAllComments().size());
    }

}