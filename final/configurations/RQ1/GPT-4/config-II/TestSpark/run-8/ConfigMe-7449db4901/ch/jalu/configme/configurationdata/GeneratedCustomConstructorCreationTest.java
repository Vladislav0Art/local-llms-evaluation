package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedCustomConstructorCreationTest {

    @Test
    public void customConstructorCreationTest() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("test-path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(customComments);
        assertEquals("Custom constructor should hold passed map",
                customComments, commentsConfiguration.getAllComments());
    }

}