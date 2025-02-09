package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path4", Arrays.asList("comment4"));
        CommentsConfiguration config = new CommentsConfiguration(initialComments);
        assertEquals(initialComments, config.getAllComments());
    }

}