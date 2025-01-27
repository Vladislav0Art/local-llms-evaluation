package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentForNewPathResultsInEmptyLine {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(settingsHolder);
    }

    @Test
    public void setCommentForNewPathResultsInEmptyLine() {
        when(settingsHolder.getComments()).thenReturn(new HashMap<>());
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        commentsConfiguration.setComment("path", "");
        assertEquals(0, ((List<String>) commentsConfiguration.getAllComments().get("path")).size());
    }

}