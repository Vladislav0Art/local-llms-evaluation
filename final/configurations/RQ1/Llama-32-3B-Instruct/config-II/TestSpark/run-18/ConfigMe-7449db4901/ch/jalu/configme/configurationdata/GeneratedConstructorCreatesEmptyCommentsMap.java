package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedConstructorCreatesEmptyCommentsMap {

    @Test
    public void constructorCreatesEmptyCommentsMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertThat(configuration.comments, is(Collections.emptyMap()));
    }

}