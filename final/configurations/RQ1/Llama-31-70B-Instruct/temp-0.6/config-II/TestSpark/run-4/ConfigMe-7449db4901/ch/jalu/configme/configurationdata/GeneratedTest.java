package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setComment_validPathAndCommentLines_setsCommentMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Arrays.asList(commentLines);
        assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

}