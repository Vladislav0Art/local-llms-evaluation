package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAdd_WithExistingPathInStructure_ProducesException {

    @Test
    public void add_WithExistingPathInStructure_ProducesException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<>(() -> "default", "path.to");
        Property<String> property2 = new Property<>(() -> "default2", "path.to.value");

        // Should not fail
        builder.add(property1);

        // Should fail, path 'path.to' already exist
        builder.add(property2);
    }

}