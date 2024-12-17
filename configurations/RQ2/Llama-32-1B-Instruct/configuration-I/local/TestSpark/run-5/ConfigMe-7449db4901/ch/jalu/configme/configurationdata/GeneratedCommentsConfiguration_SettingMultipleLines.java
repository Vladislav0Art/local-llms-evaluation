package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import io.mockk.mockk;
import org.junit.jupiter.api.Test;

public class GeneratedCommentsConfiguration_SettingMultipleLines {

    @Test
    public void CommentsConfiguration_SettingMultipleLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("", "line1\nline2");
        // No mocking needed here
        String[] expectedCommentLines = {"line1", "line2"};
        assertEquals(expectedCommentLines, commentsConfig.getAllComments().get("path"));
    }

}