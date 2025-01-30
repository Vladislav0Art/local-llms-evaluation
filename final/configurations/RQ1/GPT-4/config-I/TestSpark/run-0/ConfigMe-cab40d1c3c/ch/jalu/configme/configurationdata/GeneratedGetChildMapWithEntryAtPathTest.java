package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

public class GeneratedGetChildMapWithEntryAtPathTest {

    @Test
    public void getChildMapWithEntryAtPathTest() {
        // Arrange
        Property<String> propertyMock = mock(Property.class);
        when(propertyMock.getPath()).thenReturn("path.subpath");
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock);

        // Act
        // Trying to get child map for the path where property is already defined
        PropertyListBuilder spiedBuilder = spy(listBuilder);
        spiedBuilder.getChildMap(spiedBuilder.getRootEntries(), "path");
    }

}