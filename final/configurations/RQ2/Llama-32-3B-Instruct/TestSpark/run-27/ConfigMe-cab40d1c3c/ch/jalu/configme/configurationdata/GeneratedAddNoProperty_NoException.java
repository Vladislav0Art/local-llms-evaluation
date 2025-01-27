package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddNoProperty_NoException {

    @Test
    public void addNoProperty_NoException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
        assertNull(builder.create());
    }

}