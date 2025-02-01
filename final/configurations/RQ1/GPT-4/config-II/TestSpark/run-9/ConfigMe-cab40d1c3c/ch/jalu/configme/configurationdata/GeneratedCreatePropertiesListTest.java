package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreatePropertiesListTest {

    @Test
    public void createPropertiesListTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<>("DataSource.type", "sqlite");
        Property<String> property2 = new Property<>("Security.type", "JWT");

        // Act
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> propertiesList = builder.create();

        // Assert
        assertEquals(2, propertiesList.size());
        assertSame(property1, propertiesList.get(0));
        assertSame(property2, propertiesList.get(1));
    }

}