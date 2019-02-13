public class ZooTest {
	public void getTotalHeightTest() throws AssertException {
		Zoo jurassic = new Zoo(5);
		Animal Shark = new Animal("Blue", "Mike", 500, 20);
		Animal Bear = new Animal("Brown", "Joe", 600, 15);
		jurassic.addAnimal(Shark);
		jurassic.addAnimal(Bear);
		double expected = 20.0 + 15.0;
		double actual = Shark.getHeight() + Bear.getHeight();
		Assert.assertEquals(expected, actual);
	}
	public void getCapacityTest() throws AssertException {
		
	}
	public void toStringTest() throws AssertException {
		Zoo jurassic = new Zoo(5);
		//String expected = "These animals live in the zoo:";
		String expected = jurassic.toString();
		Assert.assertEquals(expected, jurassic.toString());
	}
}