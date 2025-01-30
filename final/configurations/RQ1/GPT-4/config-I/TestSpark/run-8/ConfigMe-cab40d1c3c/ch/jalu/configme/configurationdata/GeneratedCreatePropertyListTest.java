package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property1 = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");
        Property<String> property2 = new StringProperty("DataSource.username", "root");

        // When
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        // Then
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.contains(property1));
        assertTrue(propertyList.contains(property2));
    }

}