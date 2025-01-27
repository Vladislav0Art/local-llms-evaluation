package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedCreateWithMultipleProperties_ReturnsCorrectlyTest {

    @Test
    public void createWithMultipleProperties_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property1 = new Property<>("test1", "value1");
        Property<?> property2 = new Property<>("test2", "value2");
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property1);
        builder.add(property2);
        properties = builder.create();

        // Assert
        assertEquals(2, properties.size());
    }

}