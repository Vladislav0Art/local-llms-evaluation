package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesWhenFilledTest {

    @Test
    public void getRootEntriesWhenFilledTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.prop");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("defaultValue");
        try {
            propertyListBuilder.add(mockProperty);
            Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
            assertEquals(1, rootEntries.size());
            assertTrue(rootEntries.containsKey("test.prop"));
            assertTrue(rootEntries.get("test.prop").equals("defaultValue"));
        } catch (Exception e) {
            assertTrue(false);   // If this line is reached, there is a runtime error in our test
        }
    }

}