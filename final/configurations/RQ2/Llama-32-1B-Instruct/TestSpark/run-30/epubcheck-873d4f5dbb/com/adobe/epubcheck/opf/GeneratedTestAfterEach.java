package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestAfterEach {

    @BeforeEach
    public void setup() {
        this.publicClass = new PublicClass();
    }

    @Test
    public void testAfterEach() {
        System.out.println("testAfterEach");
    }
}

class PublicClass {

    public String method1() {
        return "public method 1";
    }

    public String method2() {
        return "public method 2";
    }

}