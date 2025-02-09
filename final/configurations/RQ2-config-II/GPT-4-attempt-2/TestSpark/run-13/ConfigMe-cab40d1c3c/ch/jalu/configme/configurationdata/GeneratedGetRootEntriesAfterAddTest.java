package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesAfterAddTest {

    @Test
    public void getRootEntriesAfterAddTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = mock(Property.class);

        // When
        propertyListBuilder.add(mockProperty);

        // Then
        assertNotNull(propertyListBuilder.getRootEntries());
    }

}