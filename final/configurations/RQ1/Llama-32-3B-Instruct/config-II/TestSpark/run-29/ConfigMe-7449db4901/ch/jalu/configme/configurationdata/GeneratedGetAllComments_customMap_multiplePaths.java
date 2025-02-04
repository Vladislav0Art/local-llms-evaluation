package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_customMap_multiplePaths {

    @Test
    public void getAllComments_customMap_multiplePaths() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("existingPath1", Arrays.asList("line11", "line12"));
        customComments.put("existingPath2", Arrays.asList("line21", "line22"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(0, config.getAllComments().size());
    }

}