package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = {"test1", "test2"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(commentsConfiguration.getAllComments().get(path), Arrays.asList(commentLines));
    }

}