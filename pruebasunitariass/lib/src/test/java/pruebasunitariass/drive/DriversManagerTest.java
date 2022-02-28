package pruebasunitariass.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	private DriversManager driversManager = new DriversManager ();
	
	
	@DisplayName ("Pruebas en el metodo addPassenger")
	@Test
	void isAddPassenger() {
		
		Passenger passenger1 = new Passenger("Marja", "ABC123");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1, driversManager.getPassenger("ABC123"));
	}
	@Test
	void isAddDriver() {
		
		Driver driver1 = new Driver(  "Marja", "ABC123", 12.5);
		driversManager.addDriver(driver1);
		assertEquals(driver1, driversManager.getDriver("ABC123"));
	}
}
