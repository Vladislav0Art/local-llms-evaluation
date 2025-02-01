package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<>("first.property", "default1");
        Property<String> property2 = new Property<>("first.property", "default2");
        builder.add(property1);
        builder.add(property2);
    }

}