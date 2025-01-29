package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest_setComment_setNewLine {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void test_setComment_setNewLine() {
        String path = "path";
        String commentLines[] = {""};
        CommentsConfiguration.commentsConfiguration.setComment(path, commentLines);

        List<String> expectedCommentLines = Collections.singletonList("");
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

}