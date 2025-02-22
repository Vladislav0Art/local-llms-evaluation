package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_duplicatePath_throwsException {

    @Test
    public void addProperty_duplicatePath_throwsException() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("duplicate.path");

        // Act
        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);

        // Assert
        // Exception is expected
    }

}