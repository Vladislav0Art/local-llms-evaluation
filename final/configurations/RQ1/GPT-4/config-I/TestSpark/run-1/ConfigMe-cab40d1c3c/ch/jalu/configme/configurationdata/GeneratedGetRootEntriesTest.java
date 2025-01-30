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

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() throws Exception {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test", "default");
        builder.add(property);
        assertEquals(property, getPropertyFromRootEntries(builder, "test"));
    }

    private Object getPropertyFromRootEntries(PropertyListBuilder builder, String path) throws Exception {
        Field field = PropertyListBuilder.class.getDeclaredField("rootEntries");
        field.setAccessible(true);
        Map<String, Object> rootEntries = (Map<String, Object>) field.get(builder);
        return rootEntries.get(path);
    }

}