package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTest_WithComments_ReturnsCorrectComments {

    @Test
    public void ConstructorTest_WithComments_ReturnsCorrectComments() {
        Map<String, List<String>> comments = Map.of("path1", List.of("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();
        assertEquals(comments, actualComments);
    }

}