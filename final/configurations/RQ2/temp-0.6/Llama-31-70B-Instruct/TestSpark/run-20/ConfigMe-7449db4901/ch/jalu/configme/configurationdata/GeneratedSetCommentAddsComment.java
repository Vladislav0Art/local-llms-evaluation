package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentAddsComment {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setCommentAddsComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test-path";
        String commentLine = "test-comment";
        commentsConfiguration.setComment(path, commentLine);
        assertEquals(commentsConfiguration.getAllComments().get(path).get(0), commentLine);
    }

}