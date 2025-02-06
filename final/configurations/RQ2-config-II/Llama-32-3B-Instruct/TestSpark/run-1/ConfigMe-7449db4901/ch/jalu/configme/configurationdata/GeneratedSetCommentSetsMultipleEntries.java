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
public class GeneratedSetCommentSetsMultipleEntries {

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
    public void setCommentSetsMultipleEntries() {
        String path1 = "path1";
        String[] commentLines = {"1", "\n2"};

        when(settingsHolder.getComments()).thenReturn(mapOfComments);

        commentsConfiguration.setComment(path1, commentLines);

        assertTrue(mapOfComments.containsKey(path1) && mapOfComments.get(path1).size() == 2);

        commentsConfiguration.setComment("path2", "3");

        assertTrue(mapOfComments.containsKey("path2") && mapOfComments.get("path2").size() == 1);
    }

}