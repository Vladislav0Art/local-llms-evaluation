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
public class GeneratedSetMultipleCommentLinesForPath {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void setMultipleCommentLinesForPath() {
        List<String> commentLines = Arrays.asList("comment1", "comment2", "comment3");
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", commentLines);
        assertEquals(commentLines, configuration.getAllComments().get("path"));
    }

}