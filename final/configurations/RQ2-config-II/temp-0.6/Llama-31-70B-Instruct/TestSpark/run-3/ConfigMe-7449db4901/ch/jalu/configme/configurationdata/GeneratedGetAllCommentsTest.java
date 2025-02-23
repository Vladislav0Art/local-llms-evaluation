package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class GeneratedGetAllCommentsTest {

    // Test 1: Check if the constructor initializes the comments map

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertEquals(Collections.unmodifiableMap(commentsConfiguration.comments), allComments);
    }

}