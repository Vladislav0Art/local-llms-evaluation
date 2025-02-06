package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsEmpty {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThat(commentsConfiguration.getAllComments(), is(Collections.emptyMap()));
    }

}