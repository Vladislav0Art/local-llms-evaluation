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
public class GeneratedSetMultipleCommentLinesForDifferentPaths {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void setMultipleCommentLinesForDifferentPaths() {
        Map<String, List<String>> expectedComments = Collections.singletonMap("path1", Arrays.asList("comment1", "comment2", "comment3"));
        when(comments.get("path1")).thenReturn(expectedComments);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "comment1", "comment2", "comment3");
        assertEquals(expectedComments, configuration.getAllComments());
    }

}