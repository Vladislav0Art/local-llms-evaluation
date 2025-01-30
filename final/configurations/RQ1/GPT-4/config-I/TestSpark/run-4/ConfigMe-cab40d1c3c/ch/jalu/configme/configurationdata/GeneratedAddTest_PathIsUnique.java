package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.resource.PropertyReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedAddTest_PathIsUnique {

    @Test
    public void addTest_PathIsUnique() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new FakeProperty("DataSource.mysql");
        Property<?> property2 = new FakeProperty("DataSource.pgsql");

        // Act
        builder.add(property1);
        builder.add(property2);

        // Assert
        List<Property<?>> properties = builder.create();
        Assert.assertEquals(2, properties.size());
        Assert.assertEquals(property1, properties.get(0));
        Assert.assertEquals(property2, properties.get(1));
    }

}