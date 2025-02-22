package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test-path";
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        List<String> comments = commentsConfiguration.getAllComments().get(path);
        assertEquals(2, comments.size());
        assertEquals("line1", comments.get(0));
        assertEquals("line2", comments.get(1));
    }

}