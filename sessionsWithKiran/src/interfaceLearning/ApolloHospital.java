package interfaceLearning;

public class ApolloHospital extends MedicalRulesAndRegs implements Lab , Ward , Finance  {

	@Override
	public void billingDept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Insurance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HRDept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void privateWard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void semiPvtWard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ICU() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void microDept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pathoDept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bioDept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feedbackForm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rulesOfMedCouncil() {
		// TODO Auto-generated method stub
		
	}
	
	// 3 interfaces finance , ward and Lab and we implemented in Apollohospital 
	// we created a parent class MedicalRulesandRegulations
	// and we created a parent interface of all the 3 interfaces named MedicalCouncil
	// if class inherits interface we use implements keywords , more than one interface can be implemented
	// if interface having a parent interface should inherit it using extends keyword
	// all the unimplemented methods of the parent interface should be implemented in the class which implements 
	// ..child interfaces
	// class extends class
	// class implements interface1 , interface2 , .....
	// interface extends interface
	
	
	

}
