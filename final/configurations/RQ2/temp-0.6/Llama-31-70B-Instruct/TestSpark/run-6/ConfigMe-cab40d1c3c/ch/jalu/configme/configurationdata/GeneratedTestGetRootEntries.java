package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetRootEntries {

    @Test
    public void testGetRootEntries() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertNotNull(result);
    }

}