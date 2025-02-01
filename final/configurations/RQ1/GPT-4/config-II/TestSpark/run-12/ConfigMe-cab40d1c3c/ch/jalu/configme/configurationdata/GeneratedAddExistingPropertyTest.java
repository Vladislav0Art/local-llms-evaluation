package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddExistingPropertyTest {

    @Test
    public void addExistingPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property = new Property<>("keyA.keyB.PropertyOne",
                false);
        // When
        builder.add(property);
        builder.add(property); // this will throw exception
    }

}