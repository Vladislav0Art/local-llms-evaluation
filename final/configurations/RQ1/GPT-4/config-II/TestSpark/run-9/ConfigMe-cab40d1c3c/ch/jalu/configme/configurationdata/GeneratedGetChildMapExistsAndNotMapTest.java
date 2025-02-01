package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetChildMapExistsAndNotMapTest {

    @Test
    public void getChildMapExistsAndNotMapTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> existingProperty = new Property<>("DataSource", "mysql");
        builder.add(existingProperty);

        // Act
        Property<String> badProperty = new Property<>("DataSource.type", "sqlite");
        builder.add(badProperty); // Should throw exception.
    }

}