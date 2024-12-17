package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import io.mockk.mockk;
import org.junit.jupiter.api.Test;

public class GeneratedCommentsConfiguration_Constructor_SingleLine {

    @Test
    public void CommentsConfiguration_Constructor_SingleLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("", "some line");
        // No mocking needed here
        String[] expectedCommentLines = {"some line"};
        assertEquals(expectedCommentLines, commentsConfig.getAllComments().get("path"));
    }

}