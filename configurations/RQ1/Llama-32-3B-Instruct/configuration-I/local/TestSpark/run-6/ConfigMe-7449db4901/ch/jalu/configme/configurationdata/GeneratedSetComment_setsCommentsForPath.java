package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setsCommentsForPath {

    @Test
    public void setComment_setsCommentsForPath() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        String commentLine1 = "line1";
        String commentLine2 = "line2";

        // When
        commentsConfig.setComment(path, commentLine1, commentLine2);

        // Then
        assertEquals(2, commentsConfig.comments.get(path).size());
        assertTrue(commentsConfig.comments.get(path).contains(commentLine1));
        assertTrue(commentsConfig.comments.get(path).contains(commentLine2));
    }

}