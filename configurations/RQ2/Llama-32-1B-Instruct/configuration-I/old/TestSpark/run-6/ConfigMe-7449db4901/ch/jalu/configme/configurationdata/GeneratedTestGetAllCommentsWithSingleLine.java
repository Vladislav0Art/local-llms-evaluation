package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedTestGetAllCommentsWithSingleLine {

    @Test
    public void testGetAllCommentsWithSingleLine() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1"));
        when(comments.get("path")).thenReturn(Arrays.asList("", ""));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] result = config.getAllComments().toArray(new String[0]);
        Assert.assertEquals("line1\n", result[0], 3, 0);
    }

}