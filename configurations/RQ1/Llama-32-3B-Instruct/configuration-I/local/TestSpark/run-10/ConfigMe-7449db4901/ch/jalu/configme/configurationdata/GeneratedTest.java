package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void shouldCreateCommentsConfiguration() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenSettingCommentWithNullPath() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("path");
        commentsConfiguration.setComment(null, "line1", "line2");
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenSettingCommentWithNullCommentLines() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("commentLines");
        commentsConfiguration.setComment("path", null, null);
    }

}