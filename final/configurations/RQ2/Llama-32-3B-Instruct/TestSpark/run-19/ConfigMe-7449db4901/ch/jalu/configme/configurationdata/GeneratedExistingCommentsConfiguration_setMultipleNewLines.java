package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedExistingCommentsConfiguration_setMultipleNewLines {

    @Test
    public void existingCommentsConfiguration_setMultipleNewLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"singleLine"};
        when(config.setComment(anyString(), any(String.class))).thenReturn(true);
        for (int i = 0; i < 3; i++) {
            config.setComment("path", commentLines);
        }
        assertEquals(Arrays.asList(Collections.singletonList(""), Collections.singletonList(""), Collections.singletonList(""))), config.getAllComments().get("path"))
        ;
    }

}