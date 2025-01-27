package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedExistingCommentsConfiguration_setNewCommentLines {

    @Test
    public void existingCommentsConfiguration_setNewCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("oldLine1", "oldLine2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"newLine1", "newLine2"};
        when(config.setComment(anyString(), any(String[].class))).thenReturn(true);
        config.setComment("path", commentLines);
        assertEquals(Arrays.asList("newLine1", "newLine2"), config.getAllComments().get("path"));
    }

}