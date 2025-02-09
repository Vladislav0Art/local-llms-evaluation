package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(map);
        configuration.setComment("path1", "line3", "line4");

        List<String> expectedComments = Arrays.asList("line3", "line4");
        assertEquals(expectedComments, configuration.getAllComments().get("path1"));
    }

}