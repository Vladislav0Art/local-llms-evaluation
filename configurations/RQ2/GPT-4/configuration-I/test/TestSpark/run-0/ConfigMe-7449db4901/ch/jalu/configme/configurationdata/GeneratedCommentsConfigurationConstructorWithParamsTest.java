package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

public class GeneratedCommentsConfigurationConstructorWithParamsTest {

    @Test
    public void commentsConfigurationConstructorWithParamsTest() {
        List<String> commentLines = Arrays.asList("Line 1", "Line 2");
        Map<String, List<String>> comments = Collections.singletonMap("path1", commentLines);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(commentLines, commentsConfiguration.getAllComments().get("path1"));
    }

}