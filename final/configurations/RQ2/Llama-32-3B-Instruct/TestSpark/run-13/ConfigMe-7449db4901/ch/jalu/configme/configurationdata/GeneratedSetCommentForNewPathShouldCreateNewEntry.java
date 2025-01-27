package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentForNewPathShouldCreateNewEntry {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void setCommentForNewPathShouldCreateNewEntry() {
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration.setComment("newPath", "commentLine");
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertTrue(((List<String>) commentsConfiguration.getAllComments().get("newPath")).contains("commentLine"));
    }

}