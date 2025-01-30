package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

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

    @Test
    public void createTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new StringProperty("DataSource.mysql.username", "");
        Property<?> property2 = new StringProperty("security.token", "");

        builder.add(property1);
        builder.add(property2);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertTrue(properties.contains(property1));
        assertTrue(properties.contains(property2));
    }

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new StringProperty("DataSource.mysql.username", "");

        builder.add(property);
        builder.add(property);
    }

    @Test
    public void addPropertyWithSimilarPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new StringProperty("DataSource", "");
        Property<?> property2 = new StringProperty("DataSource.mysql", "");

        builder.add(property1);
        builder.add(property2);
    }

}