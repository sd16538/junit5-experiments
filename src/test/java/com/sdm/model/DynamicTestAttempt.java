package com.sdm.model;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@RunWith(JUnitPlatform.class)
public class DynamicTestAttempt {

    @TestFactory
    Iterator<DynamicTest> dynamicTestsFromIterator() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", () -> assertTrue(true)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 2 * 2)),
                dynamicTest("3rd dynamic test", () -> {
                    assertEquals(4, 2 * 2);
                    assertAll(
                            () -> assertEquals("a", new String("a")),
                            () -> assertNotEquals(new BigDecimal(10.0), new BigDecimal("10.0000"))
                    );
                })
        ).iterator();
    }
}
