package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyToList_SinglePropertyAddedToEmptyList {

    @Test
    public void addPropertyToList_SinglePropertyAddedToEmptyList() {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Object());
        assertEquals(1, list.size());
    }

}