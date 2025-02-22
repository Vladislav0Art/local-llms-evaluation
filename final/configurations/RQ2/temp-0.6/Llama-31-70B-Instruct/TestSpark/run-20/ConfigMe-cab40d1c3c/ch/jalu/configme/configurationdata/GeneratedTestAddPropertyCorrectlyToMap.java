package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddPropertyCorrectlyToMap {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void testAddPropertyCorrectlyToMap() {
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test");
        propertyListBuilder.add(mockProperty);
        Assert.assertEquals(propertyListBuilder.getRootEntries().get("test"), mockProperty);
    }

}