package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        String path = "some/path/example";
        String[] commentLines = new String[]{"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);

        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

}