package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithCommentsInitializationTest {

    @Test
    public void constructorWithCommentsInitializationTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test.path", Collections.singletonList("This is a test comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("This is a test comment", commentsConfiguration.getAllComments().get("test.path").get(0));
    }

}