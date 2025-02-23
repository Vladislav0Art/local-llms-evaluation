package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;
    private Property<?> mockProperty;
    private Map<String, Object> mockMap;

    @Test
    public void testAddProperty() {
        propertyListBuilder = new PropertyListBuilder();
        mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(mockProperty);
        Map<String, Object> map = propertyListBuilder.getRootEntries();
        assertNotNull(map.get("DataSource"));
        assertEquals(1, ((Map<String, Object>) map.get("DataSource")).size());
        assertEquals(mockProperty, ((Map<String, Object>) map.get("DataSource")).get("mysql"));
    }

    @Test
    public void testAddPropertyWithInvalidPath() {
        propertyListBuilder = new PropertyListBuilder();
        mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("DataSource");
        propertyListBuilder.add(mockProperty);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(mockProperty));
    }

}