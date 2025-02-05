package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedAddDuplicatePropertyTest {

    @Test
    public void addDuplicatePropertyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> propertyUnderTest = mock(Property.class);
        when(propertyUnderTest.getPath()).thenReturn("test.path");

        // Act
        builder.add(propertyUnderTest);
        builder.add(propertyUnderTest);
    }

}