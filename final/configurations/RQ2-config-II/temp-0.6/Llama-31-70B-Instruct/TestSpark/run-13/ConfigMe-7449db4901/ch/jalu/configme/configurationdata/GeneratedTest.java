package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void setCommentForPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = new String[]{"testComment"};
        commentsConfiguration.setComment(path, commentLines);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(commentLines.length, commentsConfiguration.getAllComments().get(path).size());
        assertArrayEquals(commentLines, commentsConfiguration.getAllComments().get(path).toArray());
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = new String[]{"testComment"};
        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertEquals(commentLines.length, allComments.get(path).size());
        assertArrayEquals(commentLines, allComments.get(path).toArray());
    }

}