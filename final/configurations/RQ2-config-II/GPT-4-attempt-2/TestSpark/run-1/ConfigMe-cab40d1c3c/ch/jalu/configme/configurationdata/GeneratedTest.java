package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        // given
        Property<String> property = new StringProperty("config.key", "default");
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        builder.add(property);

        // then
        List<Property<?>> propertyList = builder.create();
        assertTrue(propertyList.contains(property));
    }

    @Test
    public void addDuplicatedPropertyTest() {
        // given
        Property<String> property = new StringProperty("config.key", "default");
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        builder.add(property);
        builder.add(property);

        // then creates exception
    }

    @Test
    public void createListTest() {
        // given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> p1 = new StringProperty("key1", "value1");
        Property<String> p2 = new StringProperty("key2", "value2");
        Property<String> p3 = new StringProperty("key3", "value3");

        // when
        builder.add(p1);
        builder.add(p2);
        builder.add(p3);

        // then
        List<Property<?>> propertyList = builder.create();
        assertTrue(propertyList.contains(p1));
        assertTrue(propertyList.contains(p2));
        assertTrue(propertyList.contains(p3));
    }

    @Test
    public void getRootEntriesTest() {
        // given
        PropertyListBuilder spiedBuilder = spy(PropertyListBuilder.class);

        // when
        Map<String, Object> rootEntries = spiedBuilder.getRootEntries();

        // then
        assertNotNull(rootEntries);
        verify(spiedBuilder, times(1)).getRootEntries();
    }

    @Test
    public void createAndAddTest() {
        // given
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        List<Property<?>> emptyList = builder.create();
        builder.add(new StringProperty("config.key", "default"));

        // then
        assertEquals(0, emptyList.size());
        assertEquals(1, builder.create().size());
    }

}