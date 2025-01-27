package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreate_EmptyList_ReturnsEmptyList {

    @Test
    public void create_EmptyList_ReturnsEmptyList() {
        List<Property<?>> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, builder.create().size());
    }

}