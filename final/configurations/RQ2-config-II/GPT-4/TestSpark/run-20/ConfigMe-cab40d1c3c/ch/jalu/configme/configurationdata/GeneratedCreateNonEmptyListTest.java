package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedCreateNonEmptyListTest {

    @Test
    public void createNonEmptyListTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> propertyUnderTest = mock(Property.class);
        when(propertyUnderTest.getPath()).thenReturn("test.path");
        when(propertyUnderTest.getDefaultValue()).thenReturn("test.default");
        builder.add(propertyUnderTest);

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        assertEquals(1, properties.size());
        assertEquals(propertyUnderTest, properties.get(0));
    }

}