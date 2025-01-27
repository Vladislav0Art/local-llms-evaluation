package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedCreateWithOneProperty_ReturnsCorrectlyTest {

    @Test
    public void createWithOneProperty_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();

        // Act
        builder.add(property);
        properties = builder.create();

        // Assert
        assertEquals(1, properties.size());
    }

}