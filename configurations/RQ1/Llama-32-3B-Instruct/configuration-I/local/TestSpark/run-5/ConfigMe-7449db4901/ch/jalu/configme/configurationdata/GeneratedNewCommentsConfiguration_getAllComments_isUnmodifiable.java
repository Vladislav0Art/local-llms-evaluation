package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_getAllComments_isUnmodifiable {

    @Test
    public void newCommentsConfiguration_getAllComments_isUnmodifiable() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.comments;
        Map<String, @UnmodifiableView List<String>> getAllComments = config.getAllComments();
        assertThat(getAllComments(comments), is(isUnmodifiable()));
    }

}