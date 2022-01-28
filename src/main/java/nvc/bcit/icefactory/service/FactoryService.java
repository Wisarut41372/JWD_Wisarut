package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.FactoryRopository;

@Service
public class FactoryService {
    @Autowired
    FactoryRopository factoryRopository;

    public List<Factory> findAll(){
        return factoryRopository.findAll();
    }

    public Factory getById(int id){
        return factoryRopository.getById(id);
    }
}
