package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> commentLines = Arrays.asList("line1", "line2");

        commentsConfig.comments.put(path, commentLines);

        // When
        Map<String,@org.jetbrains.annotations.UnmodifiableList> map = commentsConfig.getAllComments();

        // Then
        assertNotNull(map);
        assertTrue(map.containsKey(path));
        assertEquals(1, map.get(path).size());
        assertTrue(map.get(path).containsAll(commentLines));
    }

}