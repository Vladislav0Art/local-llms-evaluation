package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.resource.PropertyReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedAddTest_PathAlreadyExists {

    @Test
    public void addTest_PathAlreadyExists() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new FakeProperty("DataSource.mysql");
        Property<?> property2 = new FakeProperty("DataSource.mysql");
        builder.add(property1);

        // Act
        try {
            builder.add(property2);
            Assert.fail("Exception should have been thrown");
        } catch (ConfigMeException ex) {
            // Assert
            Assert.assertEquals("Path at 'DataSource.mysql' already exists", ex.getMessage());
        }
    }

}