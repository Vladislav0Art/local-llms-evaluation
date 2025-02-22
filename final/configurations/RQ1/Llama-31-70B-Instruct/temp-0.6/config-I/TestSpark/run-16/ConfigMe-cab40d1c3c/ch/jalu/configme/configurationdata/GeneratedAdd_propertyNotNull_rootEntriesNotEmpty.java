package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

@RunWith(JUnit4.class)
public class GeneratedAdd_propertyNotNull_rootEntriesNotEmpty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void add_propertyNotNull_rootEntriesNotEmpty() {
        // Arrange
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("abc");

        // Act
        propertyListBuilder.add(property);

        // Assert
        assertThat(propertyListBuilder.getRootEntries(), is(notNullValue()));
    }

}