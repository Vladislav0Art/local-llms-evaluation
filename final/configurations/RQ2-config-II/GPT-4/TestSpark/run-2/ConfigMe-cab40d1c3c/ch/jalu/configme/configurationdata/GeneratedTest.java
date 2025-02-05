package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockedProperty = mock(Property.class);

        // This should not throw any exception
        propertyListBuilder.add(mockedProperty);
    }

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockedProperty = mock(Property.class);
        propertyListBuilder.add(mockedProperty);

        List<Property<?>> properties = propertyListBuilder.create();

        assertNotEquals(0, properties.size());
        assertEquals(mockedProperty, properties.get(0));
    }

    @Test
    public void addNullPropertyExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
    }

}