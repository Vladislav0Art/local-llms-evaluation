package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedSetCommentTest {

    // Test case for the setComment method.

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        String path = "testPath";
        String commentLine1 = "testComment1";
        String commentLine2 = "testComment2";
        String commentLine3 = "testComment3";
        String[] commentLines = {commentLine1, commentLine2, commentLine3};

        commentsConfiguration.setComment(path, commentLines);

        Assert.assertEquals(commentsConfiguration.getAllComments().get(path), Arrays.asList(commentLines));
    }

}