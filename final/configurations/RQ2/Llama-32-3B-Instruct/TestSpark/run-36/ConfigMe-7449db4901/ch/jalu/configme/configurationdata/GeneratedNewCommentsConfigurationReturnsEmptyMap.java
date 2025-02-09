package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfigurationReturnsEmptyMap {

    @Test
    public void newCommentsConfigurationReturnsEmptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertThat(comments.getAllComments(), emptyMap());
    }

}