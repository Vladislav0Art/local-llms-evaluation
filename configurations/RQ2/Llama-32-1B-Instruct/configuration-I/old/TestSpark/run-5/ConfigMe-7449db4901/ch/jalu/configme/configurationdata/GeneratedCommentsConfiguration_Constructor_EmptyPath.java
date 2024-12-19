package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import io.mockk.mockk;
import org.junit.jupiter.api.Test;

public class GeneratedCommentsConfiguration_Constructor_EmptyPath {

    @Test
    public void CommentsConfiguration_Constructor_EmptyPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("", "some comment");
        // No mocking needed here
        String[] expectedCommentLines = {"some comment"};
        assertEquals(expectedCommentLines, commentsConfig.getAllComments().get(""));
    }

}