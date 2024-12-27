package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
    }

    @Test
    public void createWhenNoPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();

        assertTrue(properties.isEmpty());
    }

    @Test
    public void getRootEntriesWhenNoPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();

        assertTrue(rootEntries.isEmpty());
    }

}