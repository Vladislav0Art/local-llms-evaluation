package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("Test Comment1", "Test Comment2"));
        commentMap.put("path2", Arrays.asList("Test Comment3", "Test Comment4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(commentMap, commentsConfiguration.getAllComments());
    }

}