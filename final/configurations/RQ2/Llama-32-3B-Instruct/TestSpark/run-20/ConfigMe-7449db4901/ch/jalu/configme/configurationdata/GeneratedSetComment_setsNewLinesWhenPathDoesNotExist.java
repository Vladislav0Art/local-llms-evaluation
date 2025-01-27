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

public class GeneratedSetComment_setsNewLinesWhenPathDoesNotExist {

    @Test
    public void setComment_setsNewLinesWhenPathDoesNotExist() {
        var comments = new HashMap<String, List<String>>();
        var settingsHolderMock = Mockito.mock(SettingsHolder.class);
        when(settingsHolderMock.getComments()).thenReturn(comments);

        var configuration = new CommentsConfiguration();
        configuration.setComment("/path", "line1", "line2");
        assertEquals(Collections.singletonMap("/path", Arrays.asList("line1", "line2")), configuration.getAllComments());
    }

}