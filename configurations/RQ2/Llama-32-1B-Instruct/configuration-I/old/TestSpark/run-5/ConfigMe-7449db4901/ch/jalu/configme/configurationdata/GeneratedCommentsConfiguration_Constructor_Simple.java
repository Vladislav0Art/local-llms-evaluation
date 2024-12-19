package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import io.mockk.mockk;
import org.junit.jupiter.api.Test;

public class GeneratedCommentsConfiguration_Constructor_Simple {

    @Test
    public void CommentsConfiguration_Constructor_Simple() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        // No mocking needed here
        commentsConfig.setComment("", "some comment");
        // No mocking needed here
        String[] expectedCommentLines = {"some comment"};
        assertEquals(expectedCommentLines, commentsConfig.getAllComments().get("path"));
    }

}