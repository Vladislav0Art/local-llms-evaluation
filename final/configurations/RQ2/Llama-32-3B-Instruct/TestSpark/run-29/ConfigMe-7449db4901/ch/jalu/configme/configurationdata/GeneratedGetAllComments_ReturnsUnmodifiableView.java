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
public class GeneratedGetAllComments_ReturnsUnmodifiableView {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void getAllComments_ReturnsUnmodifiableView() {
        String path = "path";
        List<String> expectedCommentLines = Arrays.asList("line1", "line2");
        Map<String, List<String>> comments = Collections.singletonMap(path, expectedCommentLines);
        CommentsConfiguration commentConfiguration = new CommentsConfiguration(comments);
        Mockito.when(settingsHolder.getComments()).thenReturn(comments);
        assertEquals(expectedCommentLines, commentConfiguration.getAllComments().get(path));
    }

}