package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsShouldReturnUnmodifiableMap {

    @Test
    public void getAllCommentsShouldReturnUnmodifiableMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", new ArrayList<>());
        comments.put("key2", new ArrayList<>());

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Map<String, List<String>> result = configuration.getAllComments();

        assertThat(result, is(comments));
    }

}