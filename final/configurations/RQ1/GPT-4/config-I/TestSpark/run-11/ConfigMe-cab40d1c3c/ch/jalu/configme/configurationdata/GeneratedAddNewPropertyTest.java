package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddNewPropertyTest {

    @Test
    public void addNewPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new StringProperty("database.host", "localhost");
        builder.add(property);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue("Root entry should contain 'database'", rootEntries.containsKey("database"));
        Object subEntriesObject = rootEntries.get("database");
        assertTrue("Subentry object should be map", subEntriesObject instanceof Map);
        Map<String, Object> subEntries = (Map<String, Object>) subEntriesObject;
        assertTrue("Subentry should contain 'host'", subEntries.containsKey("host"));
    }

}