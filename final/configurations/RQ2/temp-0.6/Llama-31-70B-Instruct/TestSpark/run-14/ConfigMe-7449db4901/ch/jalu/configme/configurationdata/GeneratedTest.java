package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment() {
        String path = "test";
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(commentsConfiguration.getAllComments().get(path), Arrays.asList(commentLines));
    }

    @Test
    public void testGetAllComments() {
        commentsConfiguration = new CommentsConfiguration();
        assertEquals(commentsConfiguration.getAllComments().size(), 0);
    }

}