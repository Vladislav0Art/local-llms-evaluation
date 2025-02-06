package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewInstanceCanBeSet {

    @Test
    public void newInstanceCanBeSet() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        configuration.setComment("path", "comment1", "comment2");
        assertThat(configuration.getAllComments(), is(comments));
    }

}