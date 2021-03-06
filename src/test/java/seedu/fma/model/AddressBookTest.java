//package seedu.address.model;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
//import static seedu.address.testutil.Assert.assertThrows;
//import static seedu.address.testutil.TypicalLogs.ALICE;
//import static seedu.address.testutil.TypicalLogs.getTypicalLogBook;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import seedu.address.model.log.Log;
//import seedu.address.model.log.exceptions.DuplicateLogException;
//import seedu.address.testutil.LogBuilder;
//
//public class AddressBookTest {
////
////    private final AddressBook addressBook = new AddressBook();
////
////    @Test
////    public void constructor() {
////        assertEquals(Collections.emptyList(), addressBook.getPersonList());
////    }
////
////    @Test
////    public void resetData_null_throwsNullPointerException() {
////        assertThrows(NullPointerException.class, () -> addressBook.resetData(null));
////    }
////
////    @Test
////    public void resetData_withValidReadOnlyAddressBook_replacesData() {
////        AddressBook newData = getTypicalLogBook();
////        addressBook.resetData(newData);
////        assertEquals(newData, addressBook);
////    }
////
////    @Test
////    public void resetData_withDuplicatePersons_throwsDuplicatePersonException() {
////        // Two logs with the same identity fields
////        Log editedAlice = new LogBuilder(ALICE).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND)
////                .build();
////        List<Log> newLogs = Arrays.asList(ALICE, editedAlice);
////        AddressBookStub newData = new AddressBookStub(newLogs);
////
////        assertThrows(DuplicateLogException.class, () -> addressBook.resetData(newData));
////    }
////
////    @Test
////    public void hasPerson_nullPerson_throwsNullPointerException() {
////        assertThrows(NullPointerException.class, () -> addressBook.hasPerson(null));
////    }
////
////    @Test
////    public void hasPerson_personNotInAddressBook_returnsFalse() {
////        assertFalse(addressBook.hasPerson(ALICE));
////    }
////
////    @Test
////    public void hasPerson_personInAddressBook_returnsTrue() {
////        addressBook.addPerson(ALICE);
////        assertTrue(addressBook.hasPerson(ALICE));
////    }
////
////    @Test
////    public void hasPerson_personWithSameIdentityFieldsInAddressBook_returnsTrue() {
////        addressBook.addPerson(ALICE);
////        Log editedAlice = new LogBuilder(ALICE).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND)
////                .build();
////        assertTrue(addressBook.hasPerson(editedAlice));
////    }
////
////    @Test
////    public void getPersonList_modifyList_throwsUnsupportedOperationException() {
////        assertThrows(UnsupportedOperationException.class, () -> addressBook.getPersonList().remove(0));
////    }
////
////    /**
////     * A stub ReadOnlyAddressBook whose logs list can violate interface constraints.
////     */
////    private static class AddressBookStub implements ReadOnlyAddressBook {
////        private final ObservableList<Log> logs = FXCollections.observableArrayList();
////
////        AddressBookStub(Collection<Log> logs) {
////            this.logs.setAll(logs);
////        }
////
////        @Override
////        public ObservableList<Log> getPersonList() {
////            return logs;
////        }
////    }
//
//}
