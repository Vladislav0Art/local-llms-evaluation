package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverwritesExistingLines {

    @Test
    public void setCommentOverwritesExistingLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("existingComment1", "existingComment2"));
        configuration.setComment("path", "newComment1", "newComment2");
        assertThat(configuration.getAllComments(), is(comments));
    }

}