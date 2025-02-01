package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAddSinglePropertyTest {

    @Test
    public void addSinglePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<String>("DataSource.mysql.user", "test");
        builder.add(property);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
    }

}