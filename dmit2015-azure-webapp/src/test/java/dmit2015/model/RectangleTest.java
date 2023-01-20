package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    //Area
    @Test
    void area_ValidValues_shouldPass() {
        //Arrange
        Rectangle currentRectangle = new Rectangle();
        //Act
        currentRectangle.setLength(10);
        currentRectangle.setWidth(20);
        //Assert
        assertEquals(200, currentRectangle.area());
    }

    //Perimeter
    @Test
    void perimeter_ValidValues_shouldPass() {
        //Arrange
        Rectangle currentRectangle = new Rectangle();
        //Act
        currentRectangle.setLength(5);
        currentRectangle.setWidth(15);
        //Assert
        assertEquals(40, currentRectangle.perimeter());
    }

    //Diagonal
    @Test
    void diagonal_ValidValues_shouldPass() {
        //Arrange
        Rectangle currentRectangle = new Rectangle();
        //Act
        currentRectangle.setLength(40);
        currentRectangle.setWidth(35);
        //Assert
        assertEquals(53.15, currentRectangle.diagonal(), 0.005);
    }
}
