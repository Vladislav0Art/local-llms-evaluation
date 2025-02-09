package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedReplaceCommentTest {

    @Test
    public void replaceCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        commentsConfiguration.setComment("path1", "comment3", "comment4");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment3", "comment4"));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}