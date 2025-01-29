package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest_setComment_setExistingComment {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void test_setComment_setExistingComment() {
        String path = "path";
        String existingCommentLine = "";
        CommentsConfiguration.commentsConfiguration.setComment(path, existingCommentLine);

        List<String> expectedCommentLines = Arrays.asList(existingCommentLine);
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

}