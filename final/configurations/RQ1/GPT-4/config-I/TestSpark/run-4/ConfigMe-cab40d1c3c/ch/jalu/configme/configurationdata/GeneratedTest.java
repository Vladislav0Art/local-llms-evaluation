package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyValue;
import ch.jalu.configme.resource.PropertyReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void createTest_EmptyList() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        Assert.assertTrue(properties.isEmpty());
    }

}