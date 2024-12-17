package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

import org.mockito.Mockito;

public class GeneratedSetComment_overridesExistingComments {

    @Test
    public void setComment_overridesExistingComments() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> existingLines = Arrays.asList("existingLine1", "existingLine2");
        String commentLine1 = "line1";
        String commentLine2 = "line2";

        commentsConfig.comments.put(path, existingLines);

        // When
        commentsConfig.setComment(path, commentLine1, commentLine2);

        // Then
        assertEquals(commentLine1, commentsConfig.comments.get(path).get(0));
        assertEquals(commentLine2, commentsConfig.comments.get(path).get(1));
    }

}