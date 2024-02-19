import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class appTest {
        
    @Test
    public void testGetAverage(){
        App app = new App();

        app.appArray = new int [] {1,2,3,4,5};
        assertEquals(3.0, app.getAverage(), 0.001);

        app.appArray = new int [] {10,20,30,40,50,60,70,80,90,100};
        assertEquals(55.0, app.getAverage(), 0.001);

        app.appArray = new int[]{};
        assertEquals(0.0, app.getAverage(), 0.001);

    }
    @Test
    public void testFindPositions(){
    App app = new App();
    //Test1
        app.appArray = new int [] {1,3 ,4 ,5 ,7, 10};
        int[] expectedFindPos = {0}; 
        int[] actual = app.findPositions(1);
        assertArrayEquals(expectedFindPos, actual);
    //Test2
        app.appArray = new int [] {10,30 ,40 ,50 ,70, 100};
        int[] expectedFindPos2 = {4}; 
        int[] actual2 = app.findPositions(70);
        assertArrayEquals(expectedFindPos2, actual2);
    //Test3
        app.appArray = new int [] {10,30 ,40 ,50 ,70, 100};
        int[] expectedFindPos3 = {}; 
        int[] actual3 = app.findPositions(110);
        assertArrayEquals(expectedFindPos3, actual3);
    }

    @Test
    public void TestAppendLast(){
    //Test 1
        App app = new App();
        app.appArray = new int [] {1,3 ,4 ,5 ,7, 10};
        app.appendLast(5);
        int [] expectedAppLast = {1,3,4,5,7,10,5};
        assertArrayEquals(expectedAppLast, app.appArray); 
    //Test 2
        app.appArray = new int [] {1,3,4,5,7,10};
        app.appendLast(Integer.MAX_VALUE);
        int [] expectedAppLast1 = {1,3,4,5,7,10, Integer.MAX_VALUE};
        assertArrayEquals(expectedAppLast1, app.appArray);
    }

    @Test
    public void TestInsertAt(){
    //Test 1
        App app = new App();
        app.appArray = new int [] {1,3,4,5,7,10};
        app.insertAt(2, 5);
        int [] expectedInsertAt = {1,3,5,4,5,7,10};
        assertArrayEquals(expectedInsertAt,app.appArray);
    // Test 2
        app.appArray = new int [] {1,3,4,5,7,10};
        app.insertAt(6, 13);
        int [] expectedInsertAtLast = {1,3,4,5,7,10,13};
        assertArrayEquals(expectedInsertAtLast,app.appArray);
    //Test 3 
        app.appArray = new int[] {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () ->  app.insertAt(-1, 4));

    }
    @Test
    public void TestGetAt(){
    //Test 1
        App app = new App();
        app.appArray = new int [] {1,3,4,5,7,10};
        int result = app.getAt(2);
        assertEquals(4, result);
        //Test 2
        assertThrows(IndexOutOfBoundsException.class, () -> app.getAt(-1));
    }

    @Test
    public void TestSetAt(){
    //Test 1
    App app = new App();
    app.appArray = new int [] {1,3,5,7,9,11};
    app.insertAt(0, 0);
    int [] expectedSetFirst = {0,1,3,5,7,9,11};
    assertArrayEquals(expectedSetFirst, app.appArray);
    //Test 2
    app.insertAt(7, 13);
    int [] expectedSetLast = {0,1,3,5,7,9,11,13};
    assertArrayEquals(expectedSetLast, app.appArray);
    //Test 3
    assertThrows(IndexOutOfBoundsException.class, () -> app.setAt(-1, 5));
    }
    @Test
    public void TestDeleteAt(){
        //Test 1
        App app = new App();
        app.appArray = new int[] {1,2,3,4,5};
        int deleteFirst = app.deleteAt(0);
        assertEquals(1,deleteFirst);
        int [] expectedDeleteAtFirst = {2,3,4,5};
        assertArrayEquals(expectedDeleteAtFirst, app.appArray);
        //Test 2
        app.appArray = new int[] {1,2,3,4,5};
        int deleteLast = app.deleteAt(4);
        assertEquals(5,deleteLast);
        int [] expectedDeleteAtLast = {1,2,3,4};
        assertArrayEquals(expectedDeleteAtLast, app.appArray);
        //Test 3
        app.appArray = new int[] {1,3,5,7,9,11,13,15};
       assertThrows(IndexOutOfBoundsException.class,() -> app.deleteAt(-4));
    }
}







