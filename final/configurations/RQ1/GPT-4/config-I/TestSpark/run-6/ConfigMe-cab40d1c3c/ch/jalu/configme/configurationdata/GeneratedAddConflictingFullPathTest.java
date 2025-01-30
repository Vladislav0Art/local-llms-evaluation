package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddConflictingFullPathTest {

    @Test
    public void addConflictingFullPathTest() {
        // Given
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> firstProperty = new StringProperty("First.Second", "DefaultValue");
        Property<String> secondProperty = new StringProperty("First", "SecondDefaultValue");

        // When
        listBuilder.add(firstProperty);
        listBuilder.add(secondProperty); // Expect an exception here
    }

}