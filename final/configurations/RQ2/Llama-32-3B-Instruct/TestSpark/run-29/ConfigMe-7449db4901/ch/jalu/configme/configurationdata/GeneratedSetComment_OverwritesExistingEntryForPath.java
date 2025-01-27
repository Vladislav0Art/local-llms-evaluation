package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_OverwritesExistingEntryForPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_OverwritesExistingEntryForPath() {
        String path = "path";
        List<String> existingCommentLines = Arrays.asList("existingLine1", "line2");
        Map<String, List<String>> comments = Collections.singletonMap(path, existingCommentLines);
        CommentsConfiguration commentConfiguration = new CommentsConfiguration(comments);
        String[] newCommentLines = {"newLine1", "line3"};
        commentConfiguration.setComment(path, newCommentLines);
        assertEquals(newCommentLines, commentConfiguration.getAllComments().get(path));
    }

}