package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestCreate {

    PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void testCreate() {
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertNotNull(propertyList);
        assertTrue(propertyList.isEmpty());
    }

}