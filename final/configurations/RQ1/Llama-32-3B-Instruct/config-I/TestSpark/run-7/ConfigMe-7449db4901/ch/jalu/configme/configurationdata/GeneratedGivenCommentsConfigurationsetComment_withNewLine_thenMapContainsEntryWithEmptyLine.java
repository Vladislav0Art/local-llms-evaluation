package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenCommentsConfigurationsetComment_withNewLine_thenMapContainsEntryWithEmptyLine {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void givenCommentsConfigurationsetComment_withNewLine_thenMapContainsEntryWithEmptyLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(expectedMap);
        commentsConfig.setComment("test", "\n");
    }

}