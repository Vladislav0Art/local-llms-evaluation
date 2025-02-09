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

public class GeneratedAddDuplicatePropertyTest {

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

}