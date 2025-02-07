package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesWithPropertyTest {

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void getRootEntriesWithPropertyTest() {
        Property<String> property = mock(Property.class);
        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
        assertEquals(1, rootEntries.size());
        verify(property, times(1)).setParent(any());
    }

}