package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedCreateNoProperties_ReturnsEmptyListTest {

    @Test
    public void createNoProperties_ReturnsEmptyListTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        assertTrue(properties.isEmpty());
    }

}