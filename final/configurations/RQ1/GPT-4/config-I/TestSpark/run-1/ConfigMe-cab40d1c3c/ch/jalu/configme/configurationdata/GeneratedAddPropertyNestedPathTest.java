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

public class GeneratedAddPropertyNestedPathTest {

    @Test
    public void addPropertyNestedPathTest() throws Exception {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test.path", "default");
        builder.add(property);
        Object obj = getPropertyFromRootEntries(builder, "test");
        assertTrue(obj instanceof Map);
        fail("Test not yet implemented!");
    }

}