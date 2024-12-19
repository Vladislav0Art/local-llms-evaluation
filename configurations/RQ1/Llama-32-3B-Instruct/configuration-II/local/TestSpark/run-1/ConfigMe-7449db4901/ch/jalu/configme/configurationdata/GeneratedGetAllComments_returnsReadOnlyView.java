package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedGetAllComments_returnsReadOnlyView {

    @Test
    public void getAllComments_returnsReadOnlyView() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration.getAllComments());
        assertTrue(commentsConfiguration.getAllComments().isUnmodifiable());
    }

}