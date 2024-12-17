package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedConstructorCreatesNewEmptyMap {

    @Test
    public void constructorCreatesNewEmptyMap() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // When
        Map<String, List<String>> map = commentsConfig.comments;

        // Then
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

}