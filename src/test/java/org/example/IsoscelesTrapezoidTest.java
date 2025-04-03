package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class IsoscelesTrapezoidTest {

    @Test
    public void testCalculateArea() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(10, 6, 4, 5);
        double expectedArea = 32.0;
        assertEquals(expectedArea, trapezoid.calculateArea());
    }


    @Test
    public void testCalculatePerimeter() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(10, 6, 4, 5);
        double expectedPerimeter = 26.0;
        assertEquals(expectedPerimeter, trapezoid.calculatePerimeter());
    }


    @Test
    public void testIsIsosceles() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(10, 6, 4, 5);
        assertTrue(trapezoid.isIsosceles());
    }


    @Test
    public void testCanExist() {
        IsoscelesTrapezoid validTrapezoid = new IsoscelesTrapezoid(10, 6, 4, 5);
        assertTrue(validTrapezoid.canExist(), "Фігура повинна існувати");

        IsoscelesTrapezoid invalidTrapezoid = new IsoscelesTrapezoid(10, 6, 4, 1);
        assertFalse(invalidTrapezoid.canExist(), "Фігура не повинна існувати, бо бічна сторона занадто мала");
    }


    @Test
    public void testSetHeight() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(10, 6, 4, 5);


        double initialArea = trapezoid.calculateArea();


        trapezoid.setHeight(6);


        double expectedArea = ((10 + 6) / 2) * 6; // (base1 + base2) / 2 * height


        assertEquals(expectedArea, trapezoid.calculateArea(), "Площа повинна змінитись після зміни висоти");
    }
}
