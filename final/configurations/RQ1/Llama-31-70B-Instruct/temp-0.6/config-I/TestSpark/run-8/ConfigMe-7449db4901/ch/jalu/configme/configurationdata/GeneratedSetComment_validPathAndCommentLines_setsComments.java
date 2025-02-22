package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

public class GeneratedSetComment_validPathAndCommentLines_setsComments {

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

}