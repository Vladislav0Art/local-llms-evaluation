package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedAddProperty_NoErrorTest {

    @Test
    public void addProperty_NoErrorTest() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property);

        // Assert
        assertEquals(1, builder.create().size());
    }

}