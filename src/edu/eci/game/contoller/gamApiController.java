package edu.eci.game.contoller;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.game.model.*;
import edu.eci.game.services.gameServices;
@RestController
@RequestMapping(value = "/player")
public class gameApiController{
    @Autowired
    gameServices gs=null;
    @RequestMapping(method = RequestMethod.POST)	
    public ResponseEntity<?> AddNewBlueprint(@RequestBody player newP){
        
        try {
            gs.addPlayer(newP);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (BlueprintPersistenceException ex) {
            Logger.getLogger(gameApiController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
        }        

    }
}
