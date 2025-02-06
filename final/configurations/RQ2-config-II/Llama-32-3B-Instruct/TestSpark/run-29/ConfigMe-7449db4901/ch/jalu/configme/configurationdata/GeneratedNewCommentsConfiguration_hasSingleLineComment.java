package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_hasSingleLineComment {

    @Test
    public void newCommentsConfiguration_hasSingleLineComment() {
        CommentsConfiguration config = new CommentsConfiguration(new HashMap<>());
        config.setComment("path", "\n# comment");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.get("path").contains("# comment"));
    }

}