package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentAddsEmptyLineForPath {

    @Test
    public void setCommentAddsEmptyLineForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "\n");
        assertThat(comments.get("path1"), is(Collections.singletonList""));
    }

}