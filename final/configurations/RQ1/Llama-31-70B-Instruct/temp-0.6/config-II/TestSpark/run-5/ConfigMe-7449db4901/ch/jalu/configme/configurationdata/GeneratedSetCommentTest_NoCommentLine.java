package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentTest_NoCommentLine {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest_NoCommentLine() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        commentsConfiguration.setComment(path);
        assertNotNull(commentsConfiguration.getAllComments().get(path));
    }

}