package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;
import org.mockito.Mockito;

public class GeneratedTestGetCommentsReturnsCorrectValues {

    @Test
    public void testGetCommentsReturnsCorrectValues() {
        var comments = new HashMap<String, List<String>>();
        var mockSettingsHolder = Mockito.mock(SettingsHolder.class);
        when(mockSettingsHolder.getComments()).thenReturn(comments);
        var settingsHolder = mockSettingsHolder;
        // additional setup or assertions as necessary
    }

}