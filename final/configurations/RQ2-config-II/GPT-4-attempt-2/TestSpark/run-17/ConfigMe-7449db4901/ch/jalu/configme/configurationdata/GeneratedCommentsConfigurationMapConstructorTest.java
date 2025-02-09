package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void CommentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("testPath", Arrays.asList("Line1", "Line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("Line1", commentsConfiguration.getAllComments().get("testPath").get(0));
        assertEquals("Line2", commentsConfiguration.getAllComments().get("testPath").get(1));
    }

}