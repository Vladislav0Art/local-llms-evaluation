package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedNewCommentsConfiguration_fromMap_isPopulatedCorrectly {

    @Test
    public void newCommentsConfiguration_fromMap_isPopulatedCorrectly() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

}