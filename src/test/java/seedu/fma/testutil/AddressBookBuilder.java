package seedu.fma.testutil;

import seedu.fma.model.AddressBook;
import seedu.fma.model.log.Log;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
 *     {@code AddressBook ab = new AddressBookBuilder().withPerson("John", "Doe").build();}
 */
public class AddressBookBuilder {

    private AddressBook addressBook;

    public AddressBookBuilder() {
        addressBook = new AddressBook();
    }

    public AddressBookBuilder(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    /**
     * Adds a new {@code Log} to the {@code AddressBook} that we are building.
     */
    public AddressBookBuilder withPerson(Log log) {
        addressBook.addPerson(log);
        return this;
    }

    public AddressBook build() {
        return addressBook;
    }
}
