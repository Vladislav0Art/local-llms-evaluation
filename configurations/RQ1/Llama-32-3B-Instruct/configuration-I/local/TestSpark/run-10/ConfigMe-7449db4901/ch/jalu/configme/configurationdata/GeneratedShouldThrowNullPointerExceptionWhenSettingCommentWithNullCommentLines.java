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

public class GeneratedShouldThrowNullPointerExceptionWhenSettingCommentWithNullCommentLines {

    private CommentsConfiguration commentsConfiguration;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowNullPointerExceptionWhenSettingCommentWithNullCommentLines() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("commentLines");
        commentsConfiguration.setComment("path", null, null);
    }

}