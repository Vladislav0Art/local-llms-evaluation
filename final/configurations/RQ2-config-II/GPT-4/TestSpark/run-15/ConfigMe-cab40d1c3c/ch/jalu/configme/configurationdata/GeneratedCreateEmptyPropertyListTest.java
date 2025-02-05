package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        Assert.assertTrue(properties.isEmpty());
    }

}