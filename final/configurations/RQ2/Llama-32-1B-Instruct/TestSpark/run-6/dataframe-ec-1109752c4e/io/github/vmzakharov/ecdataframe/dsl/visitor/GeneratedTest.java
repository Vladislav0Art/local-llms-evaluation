package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testPublicClass() {
        DataFormat dataFormat = new DataFormat();
        assertEquals("data_format", dataFormat.getClass().getSimpleName());
    }

    @Test
    public void testPublicMethod() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(2, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("int", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod2() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(3, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("int", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod1() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(4, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod3() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(5, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod4() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(6, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod5() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(7, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod6() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(8, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod7() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(9, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

    @Test
    public void testPublicMethod8() {
        DataFormat dataFormat = new DataFormat();
        assertEquals(10, dataFormat.length());
        assertEquals("string", dataFormat.type());
        assertEquals("double", dataFormat.indexType());
        assertEquals(true, dataFormat.isInt64());
        assertEquals(false, dataFormat.isDouble64());
    }

}