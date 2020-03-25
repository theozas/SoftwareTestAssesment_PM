/*
 * Paulius Miliunas Copy of example
 * this class was created to remove irrelevant functionality from
 * from UserConntroller class
 * this class responsible for storing the user
 */
package ie.gmit.single;

public class UserPersistenceService {
    private Store store = new Store();

    public void saveUser(User user){
        store.store(user);
    }

}
