package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentOverwritesExistingLinesForPath {

    @Test
    public void setCommentOverwritesExistingLinesForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line3\nline4");
        configuration.setComment("path1", "line5", "line6");
        assertThat(comments.get("path1"), is(Arrays.asList("line5", "line6")));
    }

}