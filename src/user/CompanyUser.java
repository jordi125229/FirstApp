package user;

public class CompanyUser extends User {
    String companyName;
    String taxID;

    public CompanyUser(String email, String companyName, String taxID) {
        super(email, companyName);
        this.taxID = taxID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CompanyUser: " + displayName + ", taxID: " + taxID + ", email: " + email;
    }
}
