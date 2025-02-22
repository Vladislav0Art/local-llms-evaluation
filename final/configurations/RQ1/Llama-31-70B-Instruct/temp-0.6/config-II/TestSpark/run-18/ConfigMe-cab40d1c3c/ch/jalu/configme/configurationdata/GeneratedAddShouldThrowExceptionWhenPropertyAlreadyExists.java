package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddShouldThrowExceptionWhenPropertyAlreadyExists {

    @Test
    public void addShouldThrowExceptionWhenPropertyAlreadyExists() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("test.path", String.class);
        builder.add(property);

        // Act
        builder.add(property);
    }

}