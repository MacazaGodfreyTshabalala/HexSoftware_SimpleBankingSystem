
package simplebankingsystem;


public class Customer {
    
    //Details page1
    private String name;
      private String surname;
    private String dob ;
    private String gender;
    private String email;
    private String maritalStatus;
    private String address;
    private String city;
    private String province;
    private String code;
    
    //Details page 2
    private String religion;
    private String category;
    private String income;
    private String education;
    private String occupation;
    private int idNo,formNo;

   
    private String sarsNo;
    private String persalNo;
    private String pensioner;
    private String existingAcc;
    
     public Customer(String name, String surname, String dob, String gender, String email, String maritalStatus, String address, String city,
             String province,String code,String religion, String category,String income,String education,String occupation,int idNo,String sarsNo,
             String persalNo,String pensioner,String existingAcc,int formNo)
    {
        this.name = name;
        this.surname  = surname;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.city = city;
        this.province = province;
        this.code = code;
        
        this.religion = religion;
        this.category = category;
        this.income = income;
        this.education = education;
        this.occupation = occupation;
        this.idNo = idNo;
        this.sarsNo = sarsNo;
        this.persalNo = persalNo;
        this.pensioner = pensioner;
        this.existingAcc = existingAcc;
        this.formNo=formNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getSarsNo() {
        return sarsNo;
    }

    public void setSarsNo(String sarsNo) {
        this.sarsNo = sarsNo;
    }

    public String getPersalNo() {
        return persalNo;
    }

    public void setPersalNo(String persalNo) {
        this.persalNo = persalNo;
    }

    public String getPensioner() {
        return pensioner;
    }

    public void setPensioner(String pensioner) {
        this.pensioner = pensioner;
    }

    public String getExistingAcc() {
        return existingAcc;
    }

    public void setExistingAcc(String existingAcc) {
        this.existingAcc = existingAcc;
    }
     public int getFormNo() {
        return formNo;
    }

    public void setFormNo(int formNo) {
        this.formNo = formNo;
    }
  
    

   
}
