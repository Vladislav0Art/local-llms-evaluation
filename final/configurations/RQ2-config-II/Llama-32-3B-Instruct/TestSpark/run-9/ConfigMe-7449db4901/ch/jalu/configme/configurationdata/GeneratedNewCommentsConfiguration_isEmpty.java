package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_isEmpty {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertThat(comments, is(Collections.emptyMap()));
    }

}