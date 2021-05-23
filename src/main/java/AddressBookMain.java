public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        ContactDetails person = new ContactDetails();

        person.setFirstName("Datta");
        person.setLastName("Bagale");
        person.setAddress("CRPF Camp");
        person.setCity("Pune");
        person.setState("Maharashtra");
        person.setZip(410507);
        person.setPhoneNumber("8888899999");
        person.setEmail("datta@gmail.com");

        System.out.println(person);
    }
}
