package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.path");

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}