package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsCorrectData {

    @Test
    public void getAllCommentsReturnsCorrectData() {
        // Arrange:
        CommentsConfiguration config = new CommentsConfiguration();
        String path1 = "path1";
        String path2 = "path2";
        List<String> commentLine1 = Collections.singletonList("line1");
        List<String> commentLine2 = Collections.singletonList("line2");

        Map<String, @UnmodifiableView List<String>> comments = new HashMap<>();
        comments.put(path1, commentLine1);
        comments.put(path2, commentLine2);

        config.getAllComments().putAll(comments);

        // Act:
        // No setup needed as no exception should be thrown

        // Assert:
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertTrue(actualComments.containsKey(path1));
        assertEquals(commentLine1, actualComments.get(path1));
        assertTrue(actualComments.containsKey(path2));
        assertEquals(commentLine2, actualComments.get(path2));
    }

}