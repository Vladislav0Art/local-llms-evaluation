package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyExistingTest {

    @Test
    public void addPropertyExistingTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<>("DataSource.type", "sqlite");
        Property<String> property2 = new Property<>("DataSource.type", "mysql");

        // Act
        builder.add(property1);
        builder.add(property2); // Should throw exception here.
    }

}