package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedConstructorWithExistingCommentsCreatesCommentMap {

    @Test
    public void constructorWithExistingCommentsCreatesCommentMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotNull(configuration.getComments());
        assertEquals(1, configuration.getComments().size());
    }

}