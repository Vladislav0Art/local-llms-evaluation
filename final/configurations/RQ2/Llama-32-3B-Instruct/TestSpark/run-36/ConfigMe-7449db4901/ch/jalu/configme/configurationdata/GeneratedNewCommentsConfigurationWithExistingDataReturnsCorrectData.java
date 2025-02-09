package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfigurationWithExistingDataReturnsCorrectData {

    @Test
    public void newCommentsConfigurationWithExistingDataReturnsCorrectData() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        assertThat(comments.getAllComments(), equalMapContainingEntry("path", Collections.singletonList("line1")));
    }

}