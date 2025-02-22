package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(JUnit4.class)
public class GeneratedTestSetCommentNoComments {

    @Test
    public void testSetCommentNoComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path");

        Map<String, List<String>> expected = new HashMap<>();

        assertEquals(expected, configuration.getAllComments());
    }

}