package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> comments = Collections.singletonMap("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration);
    }

}