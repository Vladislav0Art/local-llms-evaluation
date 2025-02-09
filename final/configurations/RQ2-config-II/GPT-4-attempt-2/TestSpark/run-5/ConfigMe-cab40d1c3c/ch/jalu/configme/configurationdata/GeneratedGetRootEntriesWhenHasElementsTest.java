package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesWhenHasElementsTest {

    @Test
    public void getRootEntriesWhenHasElementsTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> propertyMock = Mockito.mock(Property.class);
        Mockito.when(propertyMock.getPath()).thenReturn("database.url");

        propertyListBuilder.add(propertyMock);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        Assert.assertEquals(1, rootEntries.size());
    }

}