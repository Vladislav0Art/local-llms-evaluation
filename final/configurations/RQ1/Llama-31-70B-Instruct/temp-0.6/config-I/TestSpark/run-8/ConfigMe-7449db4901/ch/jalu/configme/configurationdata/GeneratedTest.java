package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setComment_validPathAndCommentLines_setsComments() {
        // arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = new String[]{"comment1", "comment2"};

        // act
        commentsConfiguration.setComment(path, commentLines);

        // assert
        assertTrue(commentsConfiguration.getAllComments().containsKey(path));
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        // arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // act
        commentsConfiguration.setComment(null, new String[]{"comment1", "comment2"});
    }

    @Test
    public void setComment_nullCommentLines_throwsNullPointerException() {
        // arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";

        // act
        commentsConfiguration.setComment(path, null);
    }

}