package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest_setComment_noExistingComment {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void test_setComment_noExistingComment() {
        String path = "path";
        List<String> commentLines[] = {""};
        CommentsConfiguration.commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(commentLines, result.get("path"));
    }

}