package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGivenNewCommentsConfigurationthenEmptyMapIsReturned {

    @Test
    public void givenNewCommentsConfigurationthenEmptyMapIsReturned() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> result = comments.getAllComments();
        assertThat(result.isEmpty(), is(true));
    }

}