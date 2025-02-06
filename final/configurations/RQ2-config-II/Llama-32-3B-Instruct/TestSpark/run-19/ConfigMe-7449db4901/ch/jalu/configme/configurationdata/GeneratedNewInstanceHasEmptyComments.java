package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewInstanceHasEmptyComments {

    @Test
    public void newInstanceHasEmptyComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments();
        assertThat(comments.size(), is(0));
        for (Map.Entry<String, List<String>> entry : comments.entrySet()) {
            assertThat(entry.getValue().size(), is(0));
        }
    }

}