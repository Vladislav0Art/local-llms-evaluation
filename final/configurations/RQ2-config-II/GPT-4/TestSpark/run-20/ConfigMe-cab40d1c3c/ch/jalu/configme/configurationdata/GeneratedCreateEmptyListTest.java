package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedCreateEmptyListTest {

    @Test
    public void createEmptyListTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        assertTrue(properties.isEmpty());
    }

}