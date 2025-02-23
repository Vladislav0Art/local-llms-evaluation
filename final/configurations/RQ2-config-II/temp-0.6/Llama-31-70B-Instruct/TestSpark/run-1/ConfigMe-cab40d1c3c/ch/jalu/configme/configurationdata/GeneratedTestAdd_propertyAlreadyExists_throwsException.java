package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestAdd_propertyAlreadyExists_throwsException {

    @Test
    public void testAdd_propertyAlreadyExists_throwsException() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<>("test.path", "description", String.class);
        builder.add(property);

        // Act
        Exception exception = null;
        try {
            builder.add(property);
        }

    }