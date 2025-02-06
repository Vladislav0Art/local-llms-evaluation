package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_[Scenario]{

@Test
public void normaliseWhitespace_[
Scenario](){
String text = "\t\r\n  ";
String expectedOutput = "  ";

assertEquals(expectedOutput, StringUtil.normaliseWhitespace(text));
        }

        }