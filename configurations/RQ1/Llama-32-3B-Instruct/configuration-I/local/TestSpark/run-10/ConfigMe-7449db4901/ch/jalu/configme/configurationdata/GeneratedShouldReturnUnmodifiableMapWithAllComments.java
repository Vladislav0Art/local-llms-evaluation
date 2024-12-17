package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import ch.jalu.configme.SettingsHolder;

public class GeneratedShouldReturnUnmodifiableMapWithAllComments {

    private CommentsConfiguration commentsConfiguration;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldReturnUnmodifiableMapWithAllComments() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line11");
        commentsConfiguration.setComment("path2", "line22");

        Map<String, List<String>> map = ((@NotNull Map<String, @UnmodifiableView List<String>>) commentsConfiguration.getAllComments()).get("path1") != null ? ((@NotNull Map<String, @UnmodifiableView List<String>>) commentsConfiguration.getAllComments()).get("path1") : null;

        assertThat(map.size(), is(1));
        assertThat(map.get(0), is("line11"));
    }

}