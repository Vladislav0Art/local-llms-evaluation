package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorWithCommentsDoesNotThrowAnyException {

    @Test
    public void constructorWithCommentsDoesNotThrowAnyException() {
        // Arrange:
        Map<String, List<String>> comments = new HashMap<>();
        List<String> line1 = Collections.singletonList("line1");
        List<String> line2 = Collections.singletonList("line2");
        comments.put("path", Arrays.asList(line1, line2));
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // Act:
        // No setup needed as no exception should be thrown

        // Assert:
        assertTrue(true);
    }

}