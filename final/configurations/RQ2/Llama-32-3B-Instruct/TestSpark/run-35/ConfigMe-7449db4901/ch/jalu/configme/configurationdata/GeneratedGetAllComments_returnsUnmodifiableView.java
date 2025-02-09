package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_returnsUnmodifiableView {

    @Mock
    private SettingsHolder settingsHolderMock;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        when(settingsHolderMock.getComments()).thenReturn(Map.of("path1", List.of("line1")));
        String path = "path";
        List<String> commentLines = new ArrayList<>();
        try {
            commentsConfiguration.setComment(path, commentLines.toArray(new String[0]));
            assertEquals(UnsupportedOperationException.class, getStackTrace().length);
        } catch (UnsupportedOperationException e) {
            assertEquals(Map.of("path1", Arrays.asList("line1")), commentsConfiguration.getAllComments());
        }
    }

}