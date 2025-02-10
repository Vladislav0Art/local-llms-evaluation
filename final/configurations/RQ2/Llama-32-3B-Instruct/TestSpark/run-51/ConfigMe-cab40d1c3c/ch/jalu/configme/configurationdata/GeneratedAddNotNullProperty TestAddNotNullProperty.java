package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddNotNullProperty TestAddNotNullProperty {

    @Test
    public void addNotNullProperty

    TestAddNotNullProperty() {
        // Arrange
        Property<?> property = new Property<>();
        List<Property<?>> list = new ArrayList<>();

        // Act
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        list.addAll(builder.create());

        // Assert
        assertTrue(list.contains(property));
    }

}