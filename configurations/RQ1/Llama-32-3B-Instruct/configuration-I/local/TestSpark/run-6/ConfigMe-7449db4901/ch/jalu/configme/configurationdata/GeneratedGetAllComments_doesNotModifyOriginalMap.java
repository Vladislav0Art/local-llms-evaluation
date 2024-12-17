package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_doesNotModifyOriginalMap {

    @Test
    public void getAllComments_doesNotModifyOriginalMap() {
        // Given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "testPath";
        List<String> commentLines = Arrays.asList("line1", "line2");

        Map<String,@org.jetbrains.annotations.UnmodifiableList> originalComments = Collections.singletonMap(path, commentLines);
        commentsConfig.comments = originalComments;

        // When
        Map<String,@org.jetbrains.annotations.UnmodifiableList> map = commentsConfig.getAllComments();

        // Then
        assertNotNull(map);
        assertEquals(originalComments, map);
    }

}