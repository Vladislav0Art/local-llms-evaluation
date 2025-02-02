package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_ReturnsUnmodifiableList {

    @Test
    public void getAllComments_ReturnsUnmodifiableList() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        config.comments = Collections.unmodifiableMap(map);
        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("line1"), ((List<String>) config.getAllComments().get("path1")).subList(0, 1));
    }

}