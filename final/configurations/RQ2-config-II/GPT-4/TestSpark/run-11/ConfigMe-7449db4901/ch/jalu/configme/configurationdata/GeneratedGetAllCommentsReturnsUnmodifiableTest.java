package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsUnmodifiableTest {

    @Test
    public void getAllCommentsReturnsUnmodifiableTest() {
        Map<String, List<String>> inputComments = new HashMap<>();
        inputComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputComments);
        try {
            commentsConfiguration.getAllComments().put("newPath", Arrays.asList("line3", "line4"));
            Assert.fail("Expected UnsupportedOperationException not thrown.");
        } catch (UnsupportedOperationException e) {
            // Expected exception.
        }
    }

}