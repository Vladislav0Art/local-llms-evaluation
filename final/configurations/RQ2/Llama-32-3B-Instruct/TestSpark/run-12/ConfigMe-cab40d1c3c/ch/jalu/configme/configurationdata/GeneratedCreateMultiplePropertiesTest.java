package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateMultiplePropertiesTest {

    @Test
    public void createMultiplePropertiesTest() {
        // Arrange & Act
        List<Property<?>> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Object());
        builder.add(new Object());
        builder.add(new Object());

        // Assert
        assertEquals(3, builder.create().size());
    }

}