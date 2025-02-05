package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorWithInitialCommentsTest {

    @Test
    public void constructorWithInitialCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("test.path", Arrays.asList("Comment Line 1", "Comment Line 2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("Comment Line 1", "Comment Line 2"), commentsConfiguration.getAllComments().get("test.path"));
    }

}