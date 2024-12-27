package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesWhenPropertyAddedTest {

    @Test
    public void getRootEntriesWhenPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<String>("TestKey", "DefaultValue") {
            @Override
            protected String getFromExportValue(Object value) {
                return value.toString();
            }

            @Override
            protected Object toExportValue(String value) {
                return value;
            }
        };

        builder.add(property);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.containsKey("TestKey"));
    }

}