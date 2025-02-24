package ch.jalu.configme.configurationdata;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestSetCommentWithNoCommentLines {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetCommentWithNoCommentLines() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "path1";
        String[] commentLines = new String[0];
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

}