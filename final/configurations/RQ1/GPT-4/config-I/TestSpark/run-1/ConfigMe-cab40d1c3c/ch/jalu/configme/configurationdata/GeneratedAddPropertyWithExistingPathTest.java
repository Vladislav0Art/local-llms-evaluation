package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new StringProperty("test", "default");
        Property<String> property2 = new StringProperty("test", "default");
        builder.add(property1);
        builder.add(property2);
    }

}