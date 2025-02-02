package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import ch.jalu.configme.ConfigurationDataTestBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorTestWithComments {

    @Test
    public void constructorTestWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.comments);
    }

}