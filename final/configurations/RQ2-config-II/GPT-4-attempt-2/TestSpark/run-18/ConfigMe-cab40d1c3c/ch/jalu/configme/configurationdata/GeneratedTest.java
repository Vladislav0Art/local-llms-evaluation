package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);
        assertTrue(propertyListBuilder.getRootEntries().size() == 1);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("property.path"));
    }

    @Test
    public void addNullTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            propertyListBuilder.add(null);
            fail("Expected exception to be thrown");
        } catch (ConfigMeException ex) {
            assertThat(ex.getMessage(), is("Property may not be null"));
        }
    }

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("duplicate.path");

        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);
        assertTrue(propertyListBuilder.getRootEntries().size() == 1);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("duplicate.path"));
    }

    @Test
    public void createWithoutAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.isEmpty());
    }

    @Test
    public void createWithAddedPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty1 = Mockito.mock(Property.class);
        Property mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("property1.path");
        Mockito.when(mockProperty2.getPath()).thenReturn("property2.path");

        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.size() == 2);
    }

    @Test
    public void getRootEntriesBeforeAddingAnyPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesAfterAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);
        assertTrue(propertyListBuilder.getRootEntries().size() == 1);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("property.path"));
    }

}