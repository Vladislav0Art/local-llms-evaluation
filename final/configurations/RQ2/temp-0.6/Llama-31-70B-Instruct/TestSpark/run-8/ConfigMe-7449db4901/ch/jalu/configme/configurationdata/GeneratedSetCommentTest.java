package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedSetCommentTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String commentLine1 = "testCommentLine1";
        String commentLine2 = "testCommentLine2";
        commentsConfiguration.setComment(path, commentLine1, commentLine2);
        List<String> expectedComments = Arrays.asList(commentLine1, commentLine2);
        assertEquals(expectedComments, commentsConfiguration.getAllComments().get(path));
    }

}