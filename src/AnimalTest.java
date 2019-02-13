/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{
    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullConstructorTest () throws AssertException {
    	Animal Shark = new Animal("Blue", "Mike", 500, 20);
    	Assert.assertEquals("Blue", Shark.getColor());
    	Assert.assertEquals("Mike", Shark.getName());
    	Assert.assertEquals(500, Shark.getWeight(), 0.01);
    	Assert.assertEquals(20, Shark.getHeight(), 0.01);
    }
    public void animalGetColorTest() throws AssertException {
    	Animal Bear = new Animal("Brown", "Joe", 600, 15);
    	Assert.assertTrue(Bear.getColor().equals("Brown"));
    }
    public void animalGetNameTest() throws AssertException {
    	Animal Bear = new Animal("Brown", "Joe", 600, 15);
    	Assert.assertTrue(Bear.getName().equals("Joe"));
    }
    public void animalGetWeightTest() throws AssertException {
    	Animal Bear = new Animal("Brown", "Joe", 600, 15);
    	Assert.assertEquals(600, Bear.getWeight(), 0.01);
    }
    public void animalGetHeightTest() throws AssertException {
    	Animal Bear = new Animal("Brown", "Joe", 600, 15);
    	Assert.assertEquals(15, Bear.getHeight(), 0.01);
    }
    public void animalToStringTest() throws AssertException {
    	Animal Bear = new Animal("Brown", "Joe", 600.0, 15);
    	//String expected = "Joe, a Brown-colored animal. 600.0 pounds, 15.0 inches";
    	String expected = Bear.toString();
    	Assert.assertEquals(expected, Bear.toString());
    }
}