package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedAddProperty_NoProperties_ReturnsEmptyList {

    @Test
    public void addProperty_NoProperties_ReturnsEmptyList() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create();
        assertEquals(0, result.size());
    }

}