package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedConstructorWithExistingCommentsTest {

    @Test
    public void constructorWithExistingCommentsTest() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(existingComments);
        assertNotNull(config.comments);
        assertEquals(existingComments, config.comments);
    }

}