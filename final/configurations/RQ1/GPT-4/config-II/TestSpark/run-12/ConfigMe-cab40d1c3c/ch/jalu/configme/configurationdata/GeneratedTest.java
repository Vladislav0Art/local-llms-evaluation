package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addNewPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property = new Property<>("keyA.keyB.PropertyOne",
                false);
        // When
        builder.add(property);
        // Then
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.get("keyA") instanceof Map);
        assertTrue(((Map) rootEntries.get("keyA")).get("keyB") instanceof Map);
        assertSame(property, ((Map) ((Map) rootEntries.get("keyA"))
                .get("keyB")).get("PropertyOne"));
    }

    @Test
    public void addExistingPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property = new Property<>("keyA.keyB.PropertyOne",
                false);
        // When
        builder.add(property);
        builder.add(property); // this will throw exception
    }

    @Test
    public void createTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property1 = new Property<>("keyA.keyB.PropertyOne",
                false);
        Property<String> property2 = new Property<>("keyA.keyC.PropertyTwo",
                "defaultValue");
        builder.add(property1);
        builder.add(property2);
        // When
        List<Property<?>> properties = builder.create();
        // Then
        assertEquals(2, properties.size());
        assertSame(property1, properties.get(0));
        assertSame(property2, properties.get(1));
    }

    @Test
    public void addIncorrectPathTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property1 = new Property<>("keyA.keyB.PropertyOne",
                false);
        Property<String> property2 = new Property<>("keyA.keyB",
                "defaultValue");
        builder.add(property1);
        builder.add(property2); // this will throw exception
    }

}