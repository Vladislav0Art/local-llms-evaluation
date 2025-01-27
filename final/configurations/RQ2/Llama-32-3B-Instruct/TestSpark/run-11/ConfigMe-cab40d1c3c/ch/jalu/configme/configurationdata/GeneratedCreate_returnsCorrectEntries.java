package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_returnsCorrectEntries {

    @Mock
    private List<Property<?>> properties;

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void create_returnsCorrectEntries() {
        // Given: Create a map of existing entries
        Map<String, Object> rootEntry = new HashMap<>();
        rootEntries.put("key", "value");
        when(rootEntries.keySet()).thenReturn(java.util.Arrays.asList("key"));

        // When: Build the list of properties
        List<Property<?>> expectedProperties = new ArrayList<>();
        for (String key : rootEntries.keySet()) {
            Property<?> property = mock(Property.class);
            when(property.getKey()).thenReturn(key);
            expectedProperties.add(property);
        }
        List<Property<?>> actualProperties = propertyListBuilder.create();

        // Then: Verify that the created properties match expectations
        assertEquals(expectedProperties, actualProperties);

        // And verify that each property has a key and value
        for (Property<?> property : actualProperties) {
            assertNotNull(property.getKey());
            assertNotNull(property.getValue());
        }
    }

}