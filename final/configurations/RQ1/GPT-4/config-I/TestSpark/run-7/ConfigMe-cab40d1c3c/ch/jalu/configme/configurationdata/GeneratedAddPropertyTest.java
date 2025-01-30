package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        Property<?> property = new StringProperty("DataSource.mysql", "defaultValue");
        builder.add(property);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries);
        assertEquals(1, rootEntries.size());
    }

}