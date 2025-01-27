package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverwritesExistingCommentLines {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void setCommentOverwritesExistingCommentLines() {
        List<String> existingLines = Arrays.asList("comment1");
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList(existingLines, "new comment"));
        when(comments.get("path")).thenReturn(expectedLines);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "comment1", "new comment");
        assertEquals(expectedComments, configuration.getAllComments());
    }

}