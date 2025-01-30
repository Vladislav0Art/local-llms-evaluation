package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyParentPathOverrideTest {

    @Test
    public void addPropertyParentPathOverrideTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");

        // parent path tries to replace a leaf node, should throw ConfigMeException
        Property<String> propertyOverride = new StringProperty("DataSource", "will not be added");

        // When
        propertyListBuilder.add(property);
        propertyListBuilder.add(propertyOverride); // overriding property
    }

}