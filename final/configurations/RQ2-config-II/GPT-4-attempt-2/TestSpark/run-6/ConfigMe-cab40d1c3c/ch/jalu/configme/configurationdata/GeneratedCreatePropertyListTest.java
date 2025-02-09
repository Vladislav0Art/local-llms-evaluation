package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> propertyList1 = builder.create();
        List<Property<?>> propertyList2 = builder.create();
        assertNotSame(propertyList1, propertyList2);
    }

}