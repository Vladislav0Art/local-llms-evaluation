package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenCommentsConfiguration_whenGetAllComments_thenMapIsNotEmpty {

    @Test
    public void givenCommentsConfiguration_whenGetAllComments_thenMapIsNotEmpty() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList("comment"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().size() > 0);
    }

}