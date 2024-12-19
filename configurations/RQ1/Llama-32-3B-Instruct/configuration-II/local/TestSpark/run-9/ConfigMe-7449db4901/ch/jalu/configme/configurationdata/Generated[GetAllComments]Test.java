package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[GetAllComments]

Test {

    @Test
    public void [GetAllComments]Test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotNull(configuration.getAllComments());
        assertEquals(1, configuration.getAllComments().size());
    }

}