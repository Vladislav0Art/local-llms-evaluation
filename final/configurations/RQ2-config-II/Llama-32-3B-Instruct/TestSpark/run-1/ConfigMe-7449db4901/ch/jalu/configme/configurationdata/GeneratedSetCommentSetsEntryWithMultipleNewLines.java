package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentSetsEntryWithMultipleNewLines {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> mapOfComments;

    private CommentsConfiguration commentsConfiguration;

    public CommentsConfiguration() {
        this.commentsConfiguration = new CommentsConfiguration();
    }

    public CommentsConfiguration(@NotNull Map<String, List<String>> comments) {
        this.commentsConfiguration = new CommentsConfiguration(comments);
    }

    @Test
    public void setCommentSetsEntryWithMultipleNewLines() {
        String path = "path";
        String[] commentLines = {"1", "\n\n2"};

        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        commentsConfiguration.setComment(path, commentLines);

        assertTrue(mapOfComments.containsKey(path) && mapOfComments.get(path).size() == 3);
    }

}