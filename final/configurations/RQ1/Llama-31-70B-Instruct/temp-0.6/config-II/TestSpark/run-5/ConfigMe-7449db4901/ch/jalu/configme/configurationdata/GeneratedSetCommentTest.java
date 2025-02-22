package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String commentLine = "testCommentLine";
        commentsConfiguration.setComment(path, commentLine);
        assertNotNull(commentsConfiguration.getAllComments().get(path));
    }

}