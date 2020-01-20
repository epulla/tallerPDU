package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	// Test con: Worker y USD
	@Test
	void testCalculateYearBonusWorkerUSD() {
		Employee e = new Employee(400f, "USD", 0.48f, EmployeeType.Worker);
		float bonus = e.CalculateYearBonus();
		assertEquals(386f, bonus);
	}
	
	// Test con: Supervisor y USD
	@Test
	void testCalculateYearBonusSupervisorUSD() {
		Employee e = new Employee(400f, "USD", 0.48f, EmployeeType.Supervisor);
		float bonus = e.CalculateYearBonus();
		assertEquals(593f, bonus);
	}
	
	// Test con: Manager y USD
	@Test
	void testCalculateYearBonusManagerUSD() {
		Employee e = new Employee(400f, "USD", 0.48f, EmployeeType.Manager);
		float bonus = e.CalculateYearBonus();
		assertEquals(786f, bonus);
	}
	
	// Test con: Worker y EUR
	@Test
	void testCalculateYearBonusWokerEUR() {
		Employee e = new Employee(400f, "EUR", 0.48f, EmployeeType.Worker);
		float bonus = e.CalculateYearBonus();
		assertEquals(386.0f, bonus);
	}
	
	// Test con: Supervisor y EUR
	@Test
	void testCalculateYearBonusSupervisorEUR() {
		Employee e = new Employee(400f, "EUR", 0.48f, EmployeeType.Supervisor);
		float bonus = e.CalculateYearBonus();
		assertEquals(573f, bonus);
	}
	
	// Test con: Manager y EUR
	@Test
	void testCalculateYearBonusManagerEUR() {
		Employee e = new Employee(400f, "EUR", 0.48f, EmployeeType.Manager);
		float bonus = e.CalculateYearBonus();
		assertEquals(766f, bonus);
	}
	
		

}
