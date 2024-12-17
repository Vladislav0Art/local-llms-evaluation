package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import javax.annotation.Resource;

public class GeneratedCommentsConfigurationInstanceCreatedFromMap {

    @Resource
    public static final CommentsConfiguration instance = new CommentsConfiguration();

    @Test
    public void commentsConfigurationInstanceCreatedFromMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration instance = new CommentsConfiguration(map);
        assertNotNull(instance);
        assertEquals(map, (Map) instance.comments);
    }

}