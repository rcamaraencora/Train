package task2;

public class Adult extends Person {
    private String phoneNumber;
    private boolean hasLicense;

    public Adult (String name, int age, String phoneNumber, boolean hasLicense ){
        setName(name);
        setAge(age);
        this.phoneNumber = phoneNumber;
        this.hasLicense = hasLicense;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
}
