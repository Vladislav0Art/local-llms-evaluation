package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsUnmodifiableData {

    @Test
    public void getAllCommentsReturnsUnmodifiableData() {
        // Arrange:
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Collections.singletonList("line1");

        Map<String, @UnmodifiableView List<String>> comments = new HashMap<>();
        comments.put(path, commentLines);

        config.getAllComments().putAll(comments);

        // Act:
        try {
            config.getAllComments().get(path).add("newLine");
            fail("Expected UnmodifiableView exception");
        } catch (UnsupportedOperationException e) {
            assertEquals("The returned value is an unmodifiable collection", e.getMessage());
        }
    }

}