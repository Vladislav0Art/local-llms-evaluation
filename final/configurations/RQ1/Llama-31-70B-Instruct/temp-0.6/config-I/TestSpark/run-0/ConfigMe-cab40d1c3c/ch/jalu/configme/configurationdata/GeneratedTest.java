package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_PropertyAdded_SizeIncreased() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("Property1");
        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.getRootEntries().size());
    }

    @Test
    public void addProperty_PropertyDuplicate_ThrowsException() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("Property1");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void create_NoPropertyAdded_EmptyList() {
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertNotNull(propertyList);
        assertTrue(propertyList.isEmpty());
    }

}