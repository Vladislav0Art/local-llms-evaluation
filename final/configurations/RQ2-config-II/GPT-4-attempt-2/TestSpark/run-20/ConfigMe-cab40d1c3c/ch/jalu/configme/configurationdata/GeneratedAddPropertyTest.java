package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("path.test");
        propertyListBuilder.add(property);
        Map<String, Object> myRootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, myRootEntries.size());
        assertTrue(myRootEntries.containsKey("path.test"));
    }

}