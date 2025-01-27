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
public class GeneratedSetComment_AddsLinesForProvidedPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_AddsLinesForProvidedPath() {
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        CommentsConfiguration commentConfiguration = new CommentsConfiguration();
        commentConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Arrays.asList("line1", "line2");
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyMap());
        assertEquals(expectedCommentLines, commentConfiguration.getAllComments().get(path));
    }

}