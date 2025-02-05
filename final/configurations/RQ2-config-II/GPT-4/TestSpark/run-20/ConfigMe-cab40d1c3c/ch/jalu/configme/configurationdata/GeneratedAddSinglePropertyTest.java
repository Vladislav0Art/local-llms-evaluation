package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedAddSinglePropertyTest {

    @Test
    public void addSinglePropertyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> propertyUnderTest = mock(Property.class);

        // Act
        builder.add(propertyUnderTest);

        // Assert
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals(propertyUnderTest, properties.get(0));
    }

}