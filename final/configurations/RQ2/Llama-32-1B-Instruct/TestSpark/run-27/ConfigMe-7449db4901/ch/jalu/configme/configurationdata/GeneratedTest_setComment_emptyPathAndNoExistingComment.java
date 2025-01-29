package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest_setComment_emptyPathAndNoExistingComment {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void test_setComment_emptyPathAndNoExistingComment() {
        String path = "";
        CommentsConfiguration.commentsConfiguration.setComment(path, "");

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(Collections.emptyList(), result.get("path"));
    }

}