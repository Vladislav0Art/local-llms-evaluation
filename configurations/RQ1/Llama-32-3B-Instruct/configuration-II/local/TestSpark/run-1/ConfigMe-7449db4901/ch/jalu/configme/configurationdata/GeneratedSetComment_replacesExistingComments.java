package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_replacesExistingComments {

    @Test
    public void setComment_replacesExistingComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("oldLine"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "newLine");
        assertNotNull(commentsConfiguration.comments);
        assertEquals(1, commentsConfiguration.comments.get("path1").size());
    }

}