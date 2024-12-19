package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_addsNewCommentsToExistingComments {

    @Test
    public void setComment_addsNewCommentsToExistingComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "line2", "line3");
        assertNotNull(commentsConfiguration.comments);
        assertEquals(2, commentsConfiguration.comments.get("path1").size());
    }

}