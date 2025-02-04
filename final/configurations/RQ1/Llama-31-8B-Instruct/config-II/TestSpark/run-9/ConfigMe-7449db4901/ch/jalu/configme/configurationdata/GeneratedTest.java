package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void constructorTest_EmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

    @Test
    public void constructorTest_PassedMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setComment_EmptyPath() {
        commentsConfiguration.setComment("", "line1", "line2");
        assertEquals(Collections.singletonList("line1"), commentsConfiguration.getAllComments().get(""));
    }

    @Test
    public void setComment_PathWithComments() {
        commentsConfiguration.setComment("path", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void setComment_PathWithExistingComments() {
        commentsConfiguration.setComment("path", "line1", "line2");
        commentsConfiguration.setComment("path", "line3", "line4");
        assertEquals(Arrays.asList("line3", "line4"), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void setComment_PathWithNewLine() {
        commentsConfiguration.setComment("path", "\n");
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void setComment_PathWithMultipleNewLines() {
        commentsConfiguration.setComment("path", "\n", "\n");
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path"));
    }

}