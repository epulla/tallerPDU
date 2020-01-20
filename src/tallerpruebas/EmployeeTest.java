package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	@Test //Test con un employee tipo Worker y  moneda en dolar USD
	void testCsUSDWorker() {
		Employee employee = new Employee(500F,"USD",0.88F,EmployeeType.Worker);
		float salario = employee.cs() ;
		assertEquals(564.33, salario,0.01F);
	}
	
	@Test //Test con un employee tipo Supervisor y  moneda en dolar USD
	void testCsUSDSupervisor() {
		Employee employee = new Employee(400F,"USD",80F,EmployeeType.Supervisor);
		float salario = employee.cs() ;
		assertEquals(492.33, salario,0.01F);
	}
	
	
	@Test //Test con un employee tipo Manager y  moneda en dolar USD
	void testCsUSDManager() {
		Employee employee = new Employee(400F,"USD",80F,EmployeeType.Manager);
		float salario = employee.cs() ;
		assertEquals(520.33, salario,0.01F);
	}
	
	@Test //Test con un employee tipo Worker y  moneda en dolar EURO
	void testCsEUROWorker() {
		Employee employee = new Employee(500F,"EURO",0.88F,EmployeeType.Worker);
		float salario = employee.cs() ;
		assertEquals(539.33, salario,0.01F);
	}
	
	@Test //Test con un employee tipo Supervisor y  moneda en dolar EURO
	void testCsEuroSupervisor() {
		Employee employee = new Employee(400F,"EURO",80F,EmployeeType.Supervisor);
		float salario = employee.cs() ;
		assertEquals(472.33, salario,0.01F);
	}
	
	
	@Test //Test con un employee tipo Manager y  moneda en dolar EURO
	void testCsEUROManager() {
		Employee employee = new Employee(400F,"EURO",80F,EmployeeType.Manager);
		float salario = employee.cs() ;
		assertEquals(500.33, salario,0.01F);
	}
	
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
