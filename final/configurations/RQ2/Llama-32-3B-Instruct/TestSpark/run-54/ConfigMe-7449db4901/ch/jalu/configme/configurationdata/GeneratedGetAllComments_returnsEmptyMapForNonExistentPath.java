package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllComments_returnsEmptyMapForNonExistentPath {

    @Test
    public void getAllComments_returnsEmptyMapForNonExistentPath() {
        // Given:
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());

        // When:
        Map < String,@org.jetbrains.annotations.UnmodifiableList<String >> comments = configuration.getAllComments();

        // Then:
        assertNotNull(comments);
        assertTrue(comments.isEmpty());
    }

}