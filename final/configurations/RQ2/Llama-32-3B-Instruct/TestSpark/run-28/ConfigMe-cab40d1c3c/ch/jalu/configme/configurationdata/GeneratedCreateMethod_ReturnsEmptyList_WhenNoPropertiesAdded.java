package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCreateMethod_ReturnsEmptyList_WhenNoPropertiesAdded {

    @Test
    public void createMethod_ReturnsEmptyList_WhenNoPropertiesAdded() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create();
        assertTrue(result.size() == 0);
    }

}