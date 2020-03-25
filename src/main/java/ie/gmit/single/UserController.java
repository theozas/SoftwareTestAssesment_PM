/*
* Paulius Miliunas Copy of example
* class was split in to three different classes
* functionality which wasn't relevant to this class was removed to other classes
*
*/

package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class UserController {
    //Handles incoming JSON requests that work on User resource/entity
    private UserPersistenceService userSaver = new UserPersistenceService();
        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(userJson, User.class);
            ValidateUser theUser = new ValidateUser();
            boolean checkedUser = theUser.checkUser(user);
            if (!checkedUser) {
                return "ERROR";
            }
            userSaver.saveUser(user);
            return "SUCCESS";
        }
 }

