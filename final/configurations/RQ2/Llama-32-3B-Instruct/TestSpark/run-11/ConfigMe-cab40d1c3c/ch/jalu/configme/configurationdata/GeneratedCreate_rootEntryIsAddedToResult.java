package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_rootEntryIsAddedToResult {

    @Mock
    private List<Property<?>> properties;

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    public PropertyListBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void create_rootEntryIsAddedToResult() {
        // Arrange
        Map<String, Object> rootEntry = mock(Map.class);
        Property<?> property = mock(Property.class);

        when(rootEntry.containsKey("key")).thenReturn(true);
        doReturn(property).when(rootEntry).get("key");

        // Act & Assert
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.size() == 1);
    }

}