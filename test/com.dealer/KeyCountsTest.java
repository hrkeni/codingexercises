package com.dealer;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;

/**
 * Created by harshith on 5/16/16.
 */
public class KeyCountsTest extends TestCase {

    /**
     * Test an invalid file
     */
    @Test
    public void testKeyCountsInvalidFile() {
        KeyCounts kc = new KeyCounts();
        assertNull(kc.calculateKeyCounts("test1.txt"));
    }

    /**
     * Test a valid file
     */
    @Test
    public void testKeyCounts() {
        KeyCounts kc = new KeyCounts();
        Map<String, Integer> m = kc.calculateKeyCounts("test2.txt");

        assertEquals(m.get("John"), new Integer(6));
        assertEquals(m.get("Jane"), new Integer(8));
    }

    /**
     * Test a valid file with negative numbers
     */
    @Test
    public void testKeyCountsNegative() {
        KeyCounts kc = new KeyCounts();
        Map<String, Integer> m = kc.calculateKeyCounts("test3.txt");

        assertEquals(m.get("John"), new Integer(2));
        assertEquals(m.get("Jane"), new Integer(8));
    }
}
