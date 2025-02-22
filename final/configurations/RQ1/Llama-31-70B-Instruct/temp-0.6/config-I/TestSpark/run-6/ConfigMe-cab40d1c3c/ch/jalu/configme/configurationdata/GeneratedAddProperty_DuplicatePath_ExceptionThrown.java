package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProperty_DuplicatePath_ExceptionThrown {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addProperty_DuplicatePath_ExceptionThrown() {
        // Arrange
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("test.path");

        // Act
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}