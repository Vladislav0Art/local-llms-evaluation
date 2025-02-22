package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTest {

    @Test
    public void setCommentAddsCommentLinesToMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        String[] commentLines = new String[]{"Line 1", "Line 2"};

        commentsConfiguration.setComment(path, commentLines);

        assertEquals(commentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertNotNull(comments);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}