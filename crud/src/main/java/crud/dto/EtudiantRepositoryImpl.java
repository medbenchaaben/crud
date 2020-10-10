package crud.dto;

import crud.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantRepositoryImpl {
    @Autowired
    EtudiantRepository repository;

    @RequestMapping(value="/etds", method = RequestMethod.GET, produces = {"application/json"})
    public @ResponseBody List<Etudiant> getAllEtudiant(){
        return repository.findAll();
    }

}
