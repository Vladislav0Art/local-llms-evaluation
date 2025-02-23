package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTestAddsComments {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTestAddsComments() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = new String[]{"test"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(commentLines[0], commentsConfiguration.getAllComments().get(path).get(0));
    }

}