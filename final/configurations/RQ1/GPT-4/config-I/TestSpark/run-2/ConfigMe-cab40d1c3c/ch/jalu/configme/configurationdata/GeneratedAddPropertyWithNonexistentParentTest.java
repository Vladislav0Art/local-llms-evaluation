package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedAddPropertyWithNonexistentParentTest {

    @Test
    public void addPropertyWithNonexistentParentTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        try {
            Property<?> property1 = new SimpleTestProperty("nonexistent.property1", "default1");
            builder.add(property1);
            fail("Should have thrown an exception for nonexistent parent.");
        } catch (ConfigMeException e) {
            assertEquals("Unexpected entry found at path 'nonexistent'", e.getMessage());
        }
    }

}


class SimpleTestProperty implements Property<String> {

    private String path;
    private String defaultValue;

    public SimpleTestProperty(String path, String defaultValue) {
        this.path = path;
        this.defaultValue = defaultValue;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    @Override
    public String toExportValue(String value) {
        return value;
    }

}