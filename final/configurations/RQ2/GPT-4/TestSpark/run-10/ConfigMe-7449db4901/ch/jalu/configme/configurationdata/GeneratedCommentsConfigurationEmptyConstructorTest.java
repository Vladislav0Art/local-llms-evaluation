package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationEmptyConstructorTest {

    @Test
    public void commentsConfigurationEmptyConstructorTest() {
        // When
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // Then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.isEmpty());
    }

}