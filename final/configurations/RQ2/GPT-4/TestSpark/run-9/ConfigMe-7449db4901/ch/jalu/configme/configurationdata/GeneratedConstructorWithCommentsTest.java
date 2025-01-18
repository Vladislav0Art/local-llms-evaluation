package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Arrays.asList("comment 1", "comment 2"));
        initialComments.put("path2", Arrays.asList("comment 3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        assertEquals(initialComments, commentsConfiguration.getAllComments());
    }

}