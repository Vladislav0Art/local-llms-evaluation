package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationFromHashMapIsUnmodifiableView {

    @Test
    public void newCommentsConfigurationFromHashMapIsUnmodifiableView() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().equals(comments));
    }

}