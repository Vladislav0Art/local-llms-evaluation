package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;
import org.mockito.Mockito;

public class GeneratedTestSetGetComments {

    private SettingsHolder mockSettingsHolder;

    @org.junit.Before
    public void setup() {
        mockSettingsHolder = Mockito.mock(SettingsHolder.class);
        when(mockSettingsHolder.getComments()).thenReturn(new HashMap<>());
        when(mockSettingsHolder.setComments(any(HashMap.class))).thenReturn(mockSettingsHolder);
    }

    @Test
    public void testSetGetComments() {
        List<String> list = Arrays.asList("a", "b");
        var comments = new HashMap<String, List<String>>();
        comments.put("key1", list);

        when(mockSettingsHolder.getComments()).thenReturn(comments);
        SettingsHolder settingsHolder = (SettingsHolder) mockSettingsHolder;
        assertEquals(comments, settingsHolder.getComments());

        var result = settingsHolder.setComments(comments);
        assertNotNull(result);
    }

}