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

public class GeneratedShouldReturnUnmodifiableMapWhenSettingCommentWithEmptyList {

    private CommentsConfiguration commentsConfiguration;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldReturnUnmodifiableMapWhenSettingCommentWithEmptyList() {
        commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = ((@NotNull Map<String, @UnmodifiableView List<String>>) commentsConfiguration.getAllComments()).get("path");

        assertThat(map.size(), is(1));
        assertThat(map.get(0), is(Collections.emptyList()));
    }

}