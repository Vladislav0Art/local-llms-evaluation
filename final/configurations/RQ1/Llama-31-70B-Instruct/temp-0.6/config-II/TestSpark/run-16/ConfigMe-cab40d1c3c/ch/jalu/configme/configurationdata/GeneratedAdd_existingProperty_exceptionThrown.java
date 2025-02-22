package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAdd_existingProperty_exceptionThrown {

    @Test
    public void add_existingProperty_exceptionThrown() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Integer> property1 = new Property<>("path", 0);
        Property<Integer> property2 = new Property<>("path", 0);
        builder.add(property1);

        // Act and assert
        assertThrows(ConfigMeException.class, () -> builder.add(property2));
    }

}