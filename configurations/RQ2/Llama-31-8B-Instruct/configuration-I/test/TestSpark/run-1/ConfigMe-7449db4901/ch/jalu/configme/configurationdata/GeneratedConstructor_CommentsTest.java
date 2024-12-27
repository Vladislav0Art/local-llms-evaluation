package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.mockito.InjectMocks;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_CommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void constructor_CommentsTest() {
        Map<String, List<String>> comments = Map.of("path1", Arrays.asList("line1", "line2"), "path2", Arrays.asList("line3", "line4"));
        commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}