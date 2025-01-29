package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestCreateReturnsEmptyList {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void init() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testCreateReturnsEmptyList() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();

        // Act and Assert
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(0, result.size());
    }

}