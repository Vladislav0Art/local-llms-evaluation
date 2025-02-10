package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_WithoutProperties_ReturnsEmptyList {

    @Test
    public void addProperty_WithoutProperties_ReturnsEmptyList() {
        List<Property<?>> result = new PropertyListBuilder().create();
        assertEquals(0, result.size());
    }

}