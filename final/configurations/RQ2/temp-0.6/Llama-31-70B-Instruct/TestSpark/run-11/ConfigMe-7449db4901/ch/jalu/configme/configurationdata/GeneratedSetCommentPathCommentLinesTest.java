package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedSetCommentPathCommentLinesTest {

    @Test
    public void setCommentPathCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(commentLines.length, commentsConfiguration.getAllComments().get(path).size());
    }

}