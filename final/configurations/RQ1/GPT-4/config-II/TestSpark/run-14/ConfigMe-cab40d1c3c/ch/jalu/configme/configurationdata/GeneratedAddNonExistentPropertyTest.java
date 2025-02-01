package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddNonExistentPropertyTest {

    @Test
    public void addNonExistentPropertyTest() {
        Property<String> prop = Mockito.mock(Property.class);
        Mockito.when(prop.getPath()).thenReturn("test.path");
        PropertyListBuilder builder = new PropertyListBuilder();

        builder.add(prop);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.containsKey("test"));
    }

}