package com.bridgelabz;
public class ContactDetails {
        //Declaring the contact detail variables
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        Long zipCode;
        Long phoneNumber;
        String emailId;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Long getZipCode() {
            return zipCode;
        }

        public void setZipCode(Long zipCode) {
            this.zipCode = zipCode;
        }

        public Long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmail(String emailId) {
            this.emailId = emailId;
        }

    // overridden the java toString method
    @Override
    public String toString() {
        return "Address Book Contact Details = {" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Zip=" + zipCode +
                ", Phone Number='" + phoneNumber + '\'' +
                ", Email='" + emailId + '\'' +
                '}';
    }
}


