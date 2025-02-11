package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_overridesExistingComments {

    public static final String PATH = "path";
    public static final List<String> COMMENT_LINES = Arrays.asList("line1", "line2");

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_overridesExistingComments() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put(PATH, COMMENT_LINES);
        Mockito.when(settingsHolder.getComments()).thenReturn(expected);
        commentsConfiguration.setComment(PATH, "newLine1", "newLine2");
        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assert result.get(PATH).equals(Arrays.asList("newLine1", "newLine2"));
    }

}