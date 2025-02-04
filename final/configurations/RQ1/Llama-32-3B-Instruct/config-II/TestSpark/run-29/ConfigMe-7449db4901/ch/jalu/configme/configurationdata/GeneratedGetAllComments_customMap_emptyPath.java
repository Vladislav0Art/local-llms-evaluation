package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_customMap_emptyPath {

    @Test
    public void getAllComments_customMap_emptyPath() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("existingPath", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(0, config.getAllComments().size());
    }

}