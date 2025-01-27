package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_overwritesExistingCommentsCorrectly {

    @Test
    public void setComment_overwritesExistingCommentsCorrectly() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("test", "line3", "line4");
        assertEquals(Arrays.asList("line3", "line4"), config.getAllComments().get("test"));
    }

}