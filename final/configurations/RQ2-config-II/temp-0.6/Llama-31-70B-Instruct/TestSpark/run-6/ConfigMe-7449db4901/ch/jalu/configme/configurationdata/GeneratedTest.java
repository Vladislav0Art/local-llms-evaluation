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
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private CommentsConfiguration commentsConfigurationMock;

    // Test the constructor that takes a Map

    @Test
    public void testCommentsConfigurationConstructorWithMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        comments.put("path2", Collections.singletonList("comment3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertNotNull(commentsConfiguration);
    }

    @Test
    public void testCommentsConfigurationConstructorWithNoArgs() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertNotNull(commentsConfiguration);
    }

}