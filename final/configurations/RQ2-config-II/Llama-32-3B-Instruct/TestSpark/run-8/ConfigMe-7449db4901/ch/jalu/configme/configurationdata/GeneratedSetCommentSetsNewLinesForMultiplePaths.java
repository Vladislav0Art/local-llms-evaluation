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
public class GeneratedSetCommentSetsNewLinesForMultiplePaths {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> comments;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(comments);
    }

    @Test
    public void setCommentSetsNewLinesForMultiplePaths() {
        CommentsConfiguration instance = getCommentsConfiguration();
        Map<String, List<String>> commentsExpected = new HashMap<>();
        commentsExpected.put("path1", Collections.singletonList(""));
        commentsExpected.put("path2", Collections.singletonList("comment2"));
        when(settingsHolder.getComments()).thenReturn(commentsExpected);
        instance.setComment("path1", "", "comment2");
        assertEquals(commentsExpected, instance.getAllComments());
    }

}