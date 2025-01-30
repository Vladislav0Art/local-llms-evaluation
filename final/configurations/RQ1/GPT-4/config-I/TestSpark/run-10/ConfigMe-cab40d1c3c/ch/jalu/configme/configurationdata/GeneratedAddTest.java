package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new StringProperty("DataSource.mysql.username", "");

        builder.add(property);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.containsKey("DataSource"));
        Object dataSourceEntry = rootEntries.get("DataSource");
        if (dataSourceEntry instanceof Map) {
            assertTrue(((Map) dataSourceEntry).containsKey("mysql"));
            Object mysqlEntry = ((Map) dataSourceEntry).get("mysql");
            if (mysqlEntry instanceof Map) {
                assertTrue(((Map) mysqlEntry).containsKey("username"));
                assertEquals(property, ((Map) mysqlEntry).get("username"));
            }
        }
    }

}