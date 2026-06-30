class Patient {

    private String patientName;
    private String nationalId;

    public Patient(String patientName, String nationalId) {
        this.patientName = patientName;
        this.nationalId = nationalId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getNationalId() {
        return nationalId;
    }
}

class IdValidator {

    public boolean validateId(String nationalId) {
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}

class SmsService {

    public void sendSms(Patient patient) {
        System.out.println("Sending SMS to "
                + patient.getPatientName()
                + ": Registration successful.");
    }
}

public class Main{
    public static void main(String[] args){
        Patient patient = new Patient ("Joy","1234567890");
     
        IdValidator validator = new IdValidator();
        SmsService sms = new SmsService();

        if (validator.validateId(patient.getNationalId())){
            sms.sendSms(patient);
        }
else {
    System.out.println("Invalid National id.");
}
    }
}
