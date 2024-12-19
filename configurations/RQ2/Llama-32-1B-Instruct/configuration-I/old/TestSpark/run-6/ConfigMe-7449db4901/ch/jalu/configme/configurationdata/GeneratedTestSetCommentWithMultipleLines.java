package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedTestSetCommentWithMultipleLines {

    @Test
    public void testSetCommentWithMultipleLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        when(comments.get("path")).thenReturn(Arrays.asList("", ""));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path = "path";
        String commentLines[] = {"line1", "line2"};
        when(config.setComment(path, commentLines)).thenReturn(true);
        config.setComment(path, commentLines);
        Assert.assertTrue(mockitoMockito.isTrue());
    }

}