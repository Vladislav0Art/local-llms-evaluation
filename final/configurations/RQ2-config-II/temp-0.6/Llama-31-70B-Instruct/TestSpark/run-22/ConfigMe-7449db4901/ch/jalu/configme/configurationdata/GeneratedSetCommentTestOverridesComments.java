package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTestOverridesComments {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTestOverridesComments() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = new String[]{"test"};
        commentsConfiguration.setComment(path, commentLines);
        String[] commentLines2 = new String[]{"test2"};
        commentsConfiguration.setComment(path, commentLines2);
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(commentLines2[0], commentsConfiguration.getAllComments().get(path).get(0));
    }

}