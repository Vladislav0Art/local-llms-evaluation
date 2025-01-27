package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;
import org.mockito.Mockito;

import java.util.Collections;

public class GeneratedSetComment_setsEmptyLineWithoutMarker_whenPathExists {

    @Test
    public void setComment_setsEmptyLineWithoutMarker_whenPathExists() {
        var comments = new HashMap<String, List<String>>();
        var settingsHolderMock = Mockito.mock(SettingsHolder.class);
        when(settingsHolderMock.getComments()).thenReturn(comments);

        var configuration = new CommentsConfiguration();
        configuration.setComment("/path", "");
        assertEquals(Collections.singletonList(""), configuration.getAllComments().get("/path"));
    }

}