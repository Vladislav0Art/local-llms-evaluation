package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsShouldReturnUnmodifiableList {

    @Test
    public void getAllCommentsShouldReturnUnmodifiableList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", new ArrayList<>());

        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> result = configuration.getAllComments();

        assertThat(result.get("key1"), is(List.of()));
    }

}