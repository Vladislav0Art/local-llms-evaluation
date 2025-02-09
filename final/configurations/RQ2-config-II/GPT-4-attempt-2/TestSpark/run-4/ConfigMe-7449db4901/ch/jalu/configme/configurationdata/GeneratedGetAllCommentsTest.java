package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("config.path1", Arrays.asList("comment1", "comment2"));
        initialComments.put("config.path2", Arrays.asList("comment3", "comment4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        assertEquals(initialComments, commentsConfiguration.getAllComments());
    }

}