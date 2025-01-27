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
public class GeneratedGetRootEntries_returnsMap {

    @Mock
    private List<Property<?>> properties;

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void getRootEntries_returnsMap() {
        // Given: A mock map of existing entries
        when(rootEntries).thenReturn(rootEntries);

        // When: Get the root entries
        Map<String, Object> actualEntries = propertyListBuilder.getRootEntries();

        // Then: Verify that it returns a map
        assertTrue(actualEntries instanceof java.util.Map);
    }

}