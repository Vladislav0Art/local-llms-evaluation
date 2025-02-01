package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        Property<String> property1 = new StringProperty("database.connection", "default");
        Property<String> property2 = new StringProperty("database.connection", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2); // should throw exception
    }

}