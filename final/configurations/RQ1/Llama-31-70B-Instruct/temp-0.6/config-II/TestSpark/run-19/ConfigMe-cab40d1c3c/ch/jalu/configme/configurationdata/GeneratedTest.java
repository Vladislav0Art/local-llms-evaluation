package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_samePropertyAddedTwice_throwsException() {
        Property mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("test.path");

        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);
    }

    @Test
    public void addProperty_differentPropertiesWithSamePath_throwsException() {
        Property mockProperty1 = mock(Property.class);
        when(mockProperty1.getPath()).thenReturn("test.path");

        Property mockProperty2 = mock(Property.class);
        when(mockProperty2.getPath()).thenReturn("test.path");

        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);

        assertEquals(1, propertyListBuilder.getRootEntries().size());
    }

}