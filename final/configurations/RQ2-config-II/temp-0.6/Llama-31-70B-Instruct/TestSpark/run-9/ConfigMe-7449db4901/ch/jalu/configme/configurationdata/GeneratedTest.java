package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = new String[]{"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);
        assertNotNull(commentsConfiguration.getAllComments().get(path));
        assertEquals(2, commentsConfiguration.getAllComments().get(path).size());
        assertEquals("comment1", commentsConfiguration.getAllComments().get(path).get(0));
        assertEquals("comment2", commentsConfiguration.getAllComments().get(path).get(1));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = new String[]{"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}