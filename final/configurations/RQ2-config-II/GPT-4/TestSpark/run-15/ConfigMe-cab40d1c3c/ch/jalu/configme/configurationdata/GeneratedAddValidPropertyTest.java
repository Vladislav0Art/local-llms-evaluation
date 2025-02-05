package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test.path", "default");

        // Act
        builder.add(property);
        List<Property<?>> properties = builder.create();

        // Assert
        Assert.assertEquals(1, properties.size());
        Assert.assertEquals(property, properties.get(0));
    }

}