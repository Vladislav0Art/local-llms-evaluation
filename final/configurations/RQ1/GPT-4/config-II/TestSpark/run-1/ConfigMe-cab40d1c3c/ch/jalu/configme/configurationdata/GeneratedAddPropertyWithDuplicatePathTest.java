package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyWithDuplicatePathTest {

    @Test
    public void addPropertyWithDuplicatePathTest() {
        Property<Integer> property1 = new Property<Integer>("my.path", 42);
        Property<String> property2 = new Property<String>("my.path", "test");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
    }

}