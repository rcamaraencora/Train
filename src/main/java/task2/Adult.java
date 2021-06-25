package task2;

public class Adult extends Person {
    private String phoneNumber;
    private boolean hasLicense;


/* this is a comment*/
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

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
