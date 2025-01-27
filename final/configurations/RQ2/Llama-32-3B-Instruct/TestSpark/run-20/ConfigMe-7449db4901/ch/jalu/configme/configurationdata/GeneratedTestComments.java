package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;
import org.mockito.Mockito;

public class GeneratedTestComments {

    @org.junit.Before
    public void setup() {
        var mockSettingsHolder = Mockito.mock(SettingsHolder.class);
        when(mockSettingsHolder.getComments()).thenReturn(new HashMap<>());
        when(mockSettingsHolder.setComments(any(HashMap.class))).thenReturn(mockSettingsHolder);
        this.settingsHolderMock = mockSettingsHolder;
    }

    @Test
    public void testComments() {
        List<String> list = Arrays.asList("a", "b");
        var comments = new HashMap<String, List<String>>();
        comments.put("key1", list);
        when(settingsHolderMock.getComments()).thenReturn(comments);
    }

    @org.junit.Test
    public void testGetCommentsReturnsCorrectValues() {
        var comments = new HashMap<String, List<String>>();
        var mockSettingsHolder = Mockito.mock(SettingsHolder.class);
        when(mockSettingsHolder.getComments()).thenReturn(comments);
        SettingsHolder settingsHolder = (SettingsHolder) this.settingsHolderMock;
        assertEquals(comments, settingsHolder.getComments());
    }

    @org.junit.Test
    public void testSetGetComments() {
        var comments = new HashMap<String, List<String>>();
        var mockSettingsHolder = Mockito.mock(SettingsHolder.class);
        when(mockSettingsHolder.setComments(comments)).thenReturn(mockSettingsHolder);
        SettingsHolder settingsHolder = (SettingsHolder) this.settingsHolderMock;
        assertEquals(comments, settingsHolder.getComments());
    }

}