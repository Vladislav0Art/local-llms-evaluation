package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyWithNestedExistingPathTest {

    @Test
    public void addPropertyWithNestedExistingPathTest() {
        Property<String> propertyMock1 = mock(Property.class);
        when(propertyMock1.getPath()).thenReturn("nested.path");

        Property<String> propertyMock2 = mock(Property.class);
        when(propertyMock2.getPath()).thenReturn("nested");

        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock1);
        listBuilder.add(propertyMock2);
    }

}