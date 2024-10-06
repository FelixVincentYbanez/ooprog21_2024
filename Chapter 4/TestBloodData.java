public class TestBloodData {

    String bloodType;
    String rhFactor;
    
    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }
    
    public void displayBloodInfo(String bloodType, String rhFactor) {
  
        if (!bloodType.equals("A") && !bloodType.equals("B") && !bloodType.equals("O") && !bloodType.equals("AB")) {
            System.out.println("Invalid blood type. Defaulting to: A");
            defaultPatient();
        } 
        else {
            this.bloodType = bloodType;
        }
        
        if (!rhFactor.equals("+") && !rhFactor.equals("-")) {
            System.out.println("Invalid RH factor. Defaulting to: -");
            defaultPatient(); // Call to set default values
        } 
        else {
            this.rhFactor = rhFactor;
        }
        
        System.out.println("Blood Type: " + this.bloodType);
        System.out.println("RH Factor: " + this.rhFactor);
    }
}
