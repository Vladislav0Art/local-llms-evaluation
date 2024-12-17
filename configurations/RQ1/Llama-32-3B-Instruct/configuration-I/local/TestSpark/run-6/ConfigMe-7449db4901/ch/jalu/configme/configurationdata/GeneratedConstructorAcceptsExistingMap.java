package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedConstructorAcceptsExistingMap {

    @Test
    public void constructorAcceptsExistingMap() {
        // Given
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("test1", Collections.singletonList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(existingComments);

        // When
        Map<String, List<String>> map = commentsConfig.comments;

        // Then
        assertEquals(existingComments, map);
    }

}