package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsNonEmptyTest {

    @Test
    public void getAllCommentsNonEmptyTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(map);
        assertEquals(map, configuration.getAllComments());
    }

}