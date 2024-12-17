package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.rules.ExpectedException;
import ch.jalu.configme.SettingsHolder;

public class GeneratedShouldReturnUnmodifiableMapWhenCreatingWithExistingComments {

    private CommentsConfiguration commentsConfiguration;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldReturnUnmodifiableMapWhenCreatingWithExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("existingLine"));
        CommentsConfiguration configuration = new CommentsConfiguration(existingComments);

        Map<String, List<String>> map = configuration.getAllComments();

        assertThat(map.size(), is(1));
        assertThat(map.get("path"), is(Arrays.asList("existingLine")));
    }

}