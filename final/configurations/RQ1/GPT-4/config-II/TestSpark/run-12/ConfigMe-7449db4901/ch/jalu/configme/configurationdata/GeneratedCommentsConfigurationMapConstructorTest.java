package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        assertEquals("Comments should match the initial map", initialComments, commentsConfiguration.getAllComments());
    }

}