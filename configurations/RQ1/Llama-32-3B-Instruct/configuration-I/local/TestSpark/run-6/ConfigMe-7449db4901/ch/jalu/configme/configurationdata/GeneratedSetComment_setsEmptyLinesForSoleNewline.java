package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setsEmptyLinesForSoleNewline {

    @Test
    public void setComment_setsEmptyLinesForSoleNewline() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        String newlineOnly = "\n";

        // When
        commentsConfig.setComment(path, newlineOnly);

        // Then
        assertEquals(1, commentsConfig.comments.get(path).size());
        assertTrue(commentsConfig.comments.get(path).contains(newlineOnly));
    }

}