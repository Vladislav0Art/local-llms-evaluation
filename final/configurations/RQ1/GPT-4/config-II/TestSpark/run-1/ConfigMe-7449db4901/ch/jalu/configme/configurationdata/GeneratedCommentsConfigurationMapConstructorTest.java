package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path.test", Arrays.asList("Test Comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("Test Comment", commentsConfiguration.getAllComments().get("path.test").get(0));
    }

}