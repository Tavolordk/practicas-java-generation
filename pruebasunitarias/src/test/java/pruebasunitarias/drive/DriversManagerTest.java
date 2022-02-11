package pruebasunitarias.drive;

import static org.junit.Assert.*;

import org.junit.Test;

public class DriversManagerTest {

	private DriversManager driversManager = new DriversManager();
	@Test
	public void isAddPassenger() {
		Passenger p1 = new Passenger("Octavio","ADWEF3");
		driversManager.addPassenger(p1);
		assertEquals(p1, driversManager.getPassenger(p1.getId()));
	}
	@Test
	public void isAddDriver() {
		Driver d1 = new Driver("Pedro","ADCVRER",2);
		driversManager.addDriver(d1);
		assertEquals(d1, driversManager.getDriver(d1.getId()));
	}

}
